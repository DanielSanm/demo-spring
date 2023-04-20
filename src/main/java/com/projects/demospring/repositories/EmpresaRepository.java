package com.projects.demospring.repositories;

import com.projects.demospring.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    Empresa findByCnpj(String cnpj);

}
