package com.projetos.jp.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.jp.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
