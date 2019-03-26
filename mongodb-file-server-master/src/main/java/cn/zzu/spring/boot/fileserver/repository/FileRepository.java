package cn.zzu.spring.boot.fileserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.zzu.spring.boot.fileserver.domain.File;
 

/**
 * File 存储库.
 * 
 */
public interface FileRepository extends MongoRepository<File, String> {
}
