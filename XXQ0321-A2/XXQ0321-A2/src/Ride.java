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
