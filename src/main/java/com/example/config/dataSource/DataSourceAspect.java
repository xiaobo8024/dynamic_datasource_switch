package com.example.config.dataSource;



import com.example.config.dds.DynamicDataSourceThreadLocal;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class DataSourceAspect {
    //切点（设置在DAO层上）
    @Pointcut
    public void dataSourcePointCut(){}
//
//    //执行此次 AOP 中的切点(切换数据源)
//    @Before(value = "dataSourcePointCut()")
//    public void before(Joinpoint joinPoint){
////        joinPoint.getTarget();
//
//    }
//
//    @After(value = "dataSourcePoinCut()")
//    public void after(Joinpoint joinPoint){
//        DynamicDataSourceThreadLocal.removeDataSource();
//    }


}