import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Ride {


    /**
     * 设施名称
     */
    private String ridename;

    /**
     * 是否开放
     */
    private String isopen;

    /**
     * 票价
     */
    private Integer ticketprice;

    private Employee employee;

    private   LinkedList<Visitor> rideHistory; // 保存已乘坐的访客

    private int maxRiders; // 每个周期最多容纳的访客数量

    private int numOfCycles; // 记录骑行的运行次数

    public Queue queue;

    public Ride(String ridename, String isopen, Integer ticketprice, Employee employee, int maxRiders, int numOfCycles, Queue queue) {
        this.ridename = ridename;
        this.isopen = isopen;
        this.ticketprice = ticketprice;
        this.employee = employee;
        this.maxRiders = maxRiders;
        this.numOfCycles = numOfCycles;
        this.queue = queue;
        this.rideHistory = new LinkedList<Visitor>();
    }

    public String getRidename() {
        return ridename;
    }

    public void setRidename(String ridename) {
        this.ridename = ridename;
    }

    public String getIsopen() {
        return isopen;
    }

    public void setIsopen(String isopen) {
        this.isopen = isopen;
    }

    public Integer getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(Integer ticketprice) {
        this.ticketprice = ticketprice;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Ride(String ridename, String isopen, Integer ticketprice, Employee employee) {
        this.ridename = ridename;
        this.isopen = isopen;
        this.ticketprice = ticketprice;
        this.employee = employee;
    }

    public Ride() {
        this.rideHistory = new LinkedList<Visitor>();
        this.queue = new Queue();
    }

    Queue queueInfo =  new Queue();
    public void addVisitorToQueue(Visitor visitor) {
        queueInfo.addVisitor(visitor);
        System.out.println(visitor.getName() + " have joined the queue of amusement facilities");
    }

    public void removeVisitorFromQueue() {
        Visitor visitor = queueInfo.removeVisitor();
        System.out.println(visitor.getName() + " removed from the queue!");
    }


    public void removeVisitorFromQueueByIndex(int index) {
        Visitor visitor = queueInfo.removeVisitorByIndex(index);
        System.out.println(visitor.getName() + " removed from the queue!");
    }
    public void printQueue() {
        queueInfo.printQueue();
    }


    private void addVisitorToHistory(Visitor visitor) {

        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to history");
    }


    public boolean checkVisitorFromHistory(Visitor visitor) {
        return this.rideHistory.contains(visitor);
    }

    public int numberOfVisitors() {
        return this.rideHistory.size();
    }

    public void printRideHistory() {
        if (this.rideHistory.isEmpty()) {
        } else {
            Iterator<Visitor> iterator = rideHistory.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }


    // 新增排序方法
    public void sortRideHistory() {
        Collections.sort(this.rideHistory, new VisitorComparator());
        System.out.println("Ride records have been sorted by name and age");
    }

    public void runOneCycle() {
        // 检查队列中是否有访客
        int ridersThisCycle = Math.min(maxRiders, 1); // 根据 maxRiders 和队列大小计算本周期乘客数

        for (int i = 0; i < ridersThisCycle; i++) {
            removeVisitorFromQueue(); // 让访客乘坐，并从队列中移除
        }

        numOfCycles++; // 增加运行次数
    }


    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : this.rideHistory) {
                writer.write(visitor.toString());
                writer.newLine();
            }
            System.out.println("File" + filename + " save successfully");
        } catch (IOException e) {
            System.err.println("Storage failure " + e.getMessage());
        }
    }

    public void importRideHistory(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // 假设 Visitor 的构造函数可以从字符串中解析出名字和年龄
                String[] parts = line.split(", Age: ");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age;
                    try {
                        age = Integer.parseInt(parts[1]);
                        Visitor visitor = new Visitor(name, "2");
                        this.rideHistory.add(visitor); // 将 Visitor 添加到历史中
                        System.out.println(visitor.getName() + " have imported it to the history.");
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid age format for visitor: " + parts[1]);
                    }
                } else {

                }
            }
            System.out.println("From" + filename + " import successfully");
        } catch (IOException e) {
            System.err.println("Read error " + e.getMessage());
        }
    }

    public int getVisitorCount() {
        return this.rideHistory.size(); // 返回访客数量
    }


}
