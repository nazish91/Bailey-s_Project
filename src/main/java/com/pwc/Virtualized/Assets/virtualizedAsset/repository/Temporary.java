
package com.pwc.Virtualized.Assets.virtualizedAsset.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pwc.Virtualized.Assets.virtualizedAsset.model.TemporaryModel;

@Repository

public interface Temporary extends JpaRepository<TemporaryModel, Long> {
	Optional<TemporaryModel> findById(Long id);
}
