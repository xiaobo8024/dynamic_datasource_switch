package com.example.config.repository;


import com.example.config.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository {
    User findById(Long id); //默认数据源

//    @TargetDataSource("test02")
//    @Query()
//    User findByIdFromTest2(Long id); //使用test2数据源
}
