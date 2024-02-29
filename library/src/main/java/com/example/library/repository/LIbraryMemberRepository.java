package com.example.library.repository;

import com.example.library.entity.LibraryMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LIbraryMemberRepository extends JpaRepository<LibraryMember, Integer> {

}