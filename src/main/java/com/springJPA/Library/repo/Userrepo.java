package com.springJPA.Library.repo;

//import com.springJPA.Library.Modal.Book;
import com.springJPA.Library.Modal.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<UserDetail, Long> {
}
