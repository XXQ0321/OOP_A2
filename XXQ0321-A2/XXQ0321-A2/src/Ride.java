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
