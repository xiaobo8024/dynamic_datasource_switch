package com.example.config.dds;

/**
 *使用ThreadLocal 保存数据源信息
 */
public class DynamicDataSourceThreadLocal {
    private static final ThreadLocal<String> THREAD_LOCAL= new ThreadLocal<>();

    public static void setDataSource(String name){
        THREAD_LOCAL.set(name);
    }

    public static  String getDataSource(){
        return THREAD_LOCAL.get();
    }

    public static  void removeDataSource(){
        THREAD_LOCAL.remove();
    }
}