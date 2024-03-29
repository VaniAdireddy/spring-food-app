package com.foodapp.springfoodapp.file.repo;

import com.foodapp.springfoodapp.file.entity.FileData;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FileRepo extends JpaRepository<FileData, Integer> {
    Optional<FileData> findByName(String fileName);
}
