public class AssignmentTwo {
    public static void main(String[] args) {

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partThree();
        assignmentTwo.partFourA();
        assignmentTwo.partFourB();
        assignmentTwo.partFive();
        assignmentTwo.partSix();
        assignmentTwo.partSeven();
    }

    public  void partThree(){
        // 创建 Ride 对象
        Ride ride = new Ride();
            Visitor[] visitors = {
               new Visitor("Smith",18,"Male","13888888888", "Prime customer"),
               new Visitor("Jackson",19,"Male","13899999999", "Civilized customer"),
               new Visitor("Elsa",12,"Female","13666666666", "Good customer"),
               new Visitor("Mark",13,"Male","13555555555", "Prime customer"),
               new Visitor("Jennie",15,"Female","13444444444", "Prime customer")
        };


        for (Visitor visitor : visitors) {
            ride.addVisitorToQueue(visitor);
        }

        // 从队列中移除一个访客
        ride.removeVisitorFromQueue();

        // 打印队列中所有的访客
        ride.printQueue();
    };


   public  void partFourA() {

       Ride ride = new Ride();
       Visitor[] visitors = {
        new Visitor("Smith",18,"Male","13888888888", "Prime customer"),
        new Visitor("Jackson",19,"Male","13899999999", "Civilized customer"),
        new Visitor("Elsa",12,"Female","13666666666", "Good customer"),
        new Visitor("Mark",13,"Male","13555555555", "Prime customer"),
        new Visitor("Jennie",15,"Female","13444444444", "Prime customer")
       };

       for (Visitor visitor : visitors) {
           ride.addVisitorToQueue(visitor);
       }

       // 模拟访客乘坐游乐设施
       for (int i = 0; i < 3; i++) {
           ride.removeVisitorFromQueue(); // 移除并添加到历史记录
       }

       // 检查某个访客是否在历史记录中
       Visitor visitor = new Visitor("Smith",18,"Male","13888888888", "Prime customer");
       boolean found = ride.checkVisitorFromHistory(visitor);
       if (found) {
           System.out.println(visitor.getName() + " exists in historical records");
       } else {
           System.out.println(visitor.getName() + " not exist in historical records");
       }

       // 打印历史记录的访客数量
       System.out.println("The number of visitors recorded " + ride.numberOfVisitors());

       // 打印历史记录中的所有访客
       ride.printRideHistory();
   }

   public  void partFourB() {
       // 创建 Ride 对象
       Ride ride = new Ride();

       // 创建并添加访客到队列中
       Visitor[] visitors = {
        new Visitor("Smith",18,"Male","13888888888", "Prime customer"),
        new Visitor("Jackson",19,"Male","13899999999", "Civilized customer"),
        new Visitor("Elsa",12,"Female","13666666666", "Good customer"),
        new Visitor("Mark",13,"Male","13555555555", "Prime customer"),
        new Visitor("Jennie",15,"Female","13444444444", "Prime customer")
       };

       for (Visitor visitor : visitors) {
           ride.addVisitorToQueue(visitor);
       }

       // 模拟访客乘坐游乐设施
       for (int i = 0; i < 5; i++) {
           ride.removeVisitorFromQueue(); // 所有访客依次乘坐
       }

       // 打印历史记录的访客
       ride.printRideHistory();

       // 现在对历史记录进行排序
       ride.sortRideHistory();

       // 打印排序后的历史记录
       ride.printRideHistory();
   }

   public  void partFive() {
       // 创建 Ride 对象，设置最大乘客为 5
       Ride ride = new Ride();

       // 创建并添加访客到队列中
       Visitor[] visitors = {
               new Visitor("Smith",18,"Male","13888888888", "Prime customer"),
               new Visitor("Jackson",19,"Male","13899999999", "Civilized customer"),
               new Visitor("Elsa",12,"Female","13666666666", "Good customer"),
               new Visitor("Mark",13,"Male","13555555555", "Prime customer"),
               new Visitor("Jennie",15,"Female","13444444444", "Prime customer")
       };

       for (Visitor visitor : visitors) {
           ride.addVisitorToQueue(visitor);
       }

       // 打印队列中的所有访客
       ride.queue.printQueue();

       // 运行一个周期
       ride.runOneCycle();

       // 打印队列中的所有访客 运行一个周期后
       ride.queue.printQueue();

       // 打印收集的所有访客
       ride.printRideHistory();
   }




   public  void partSix() {
       // 创建 Ride 对象，设置最大乘客为 5
       Ride ride = new Ride();

       // 创建并添加访客到队列中
               Visitor[] visitors = {
                new Visitor("Smith",18,"Male","13888888888", "Prime customer"),
                new Visitor("Jackson",19,"Male","13899999999", "Civilized customer"),
                new Visitor("Elsa",12,"Female","13666666666", "Good customer"),
                new Visitor("Mark",13,"Male","13555555555", "Prime customer"),
                new Visitor("Jennie",15,"Female","13444444444", "Prime customer")
       };

       for (Visitor visitor : visitors) {
           ride.addVisitorToQueue(visitor);
       }

       // 运行一个周期
       ride.runOneCycle();

       // 导出访客历史记录到文件
       String filename = "history.txt";
       ride.exportRideHistory(filename);
   }

    public  void partSeven() {
        // 创建 Ride 对象，设置最大乘客为 5
        Ride ride = new Ride();

        // 导入先前生成的访客历史记录
        String filename = "history.txt";
        ride.importRideHistory(filename);

        // 打印导入的访客数量
        int visitorCount = ride.getVisitorCount();
        System.out.println("Total number of tourists: " + visitorCount);

        // 打印所有访客详细信息
        ride.printRideHistory();
    }


}
