package jvm.test;

public class T5_NeicunFenPei {

    public static void main(String[] args) {
        //-XX:+/-    +表示开启   -表示禁用
        //-XX:+PrintGCDetails
        //空格隔开多条指令
        //ava的gc回收的类型主要有几种
        // UseSerialGC，UseConcMarkSweepGC，
        // UseParNewGC，UseParallelGC，UseParallelOldGC，UseG1GC，

        //    收集器的选用 是根据 jdk所处的环境进行选择
        //    如果是作为服务默认是 parallel
        //    客户端环境下serial

        //    java -version 可查看jdk所处环境
        //    一般情况下都是server　默认内存>2G 且CPU是多核
        //    Server VM

        //-XX:+UseSerialGC -XX:+PrintGCDetails -Xms20m -Xmx20m -Xmn10m -XX:SurvivorRatio=8
        //    xms初始化堆大小
        //    xmx最大堆大小
        //    xmn 新生代堆大小
        //    eden区域大小设置：-XX:surivorRatio=8
        //byte[] b = new byte[5 * 1024 * 1024];
        //byte[] bb = new byte[2 * 1024 * 1024];
        //byte[] b2 = new byte[1 * 1024 * 1024];
        //byte[] b3 = new byte[2 * 1024 * 1024];
        //byte[] b4 = new byte[5 * 1024 * 1024];


        // the space 10240K,  90% used [0x00000    大对象直接进入老年代
        //byte[] oldSpace = new byte[8 * 1024 * 1024];
        //指定进老年区的门槛： -XX:PretenureSizeThreshold=5m  超过这个大小就进入老年区
        byte[] oldSpace = new byte[5 * 1024 * 1024];

        //长期存活对象进入老年代 阈值一般为15 实际情况甚至2-3次就可以

        //the space 10240K,  86% use   新生代不够用会向老年代进行空间分配担保

        System.gc();//回收此区域 from space 1024K,   0% used [0x0

    }
}
