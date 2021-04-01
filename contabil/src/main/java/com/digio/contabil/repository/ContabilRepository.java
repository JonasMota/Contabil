package com.digio.contabil.repository;

import com.digio.contabil.entity.Lançamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContabilRepository extends JpaRepository <Lançamentos, Long>{
}
