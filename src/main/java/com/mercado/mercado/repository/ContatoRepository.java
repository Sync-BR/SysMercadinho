package com.mercado.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mercado.mercado.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {


}
