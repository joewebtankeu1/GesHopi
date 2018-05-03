package com.GesHop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GesHop.entites.Utilisateur;

public interface  UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

}
