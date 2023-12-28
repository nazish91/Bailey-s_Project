package com.pwc.Virtualized.Assets.virtualizedAsset.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pwc.Virtualized.Assets.virtualizedAsset.model.Student;

@Repository
public interface XmlFromSAP extends JpaRepository<Student, Long> {

	Optional<Student> findById(Long id);
}
