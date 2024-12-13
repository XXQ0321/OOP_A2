public  void partThree(){
        // 创建 Ride 对象
        Ride ride = new Ride();
            Visitor[] visitors = {
                new Visitor("张三",18,"男","13888888888", "优等客户"),
                new Visitor("李四",19,"男","13899999999", "文明客户"),
                new Visitor("大熊",12,"男","13666666666", "不错客户"),
                new Visitor("胖虎",13,"男","13555555555", "优等客户"),
                new Visitor("静香",15,"女","13444444444", "优等客户")
        };


        for (Visitor visitor : visitors) {
            ride.addVisitorToQueue(visitor);
        }

        // 从队列中移除一个访客
        ride.removeVisitorFromQueue();

        // 打印队列中所有的访客
        ride.printQueue();
    };
