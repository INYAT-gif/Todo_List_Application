package se.inyat.todo_list_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.inyat.todo_list_application.data.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    //Check if the email exists in the database
    Boolean existsByEmail(String email);

    //JPQL query update expired to true or false
    @Modifying
    @Query("update User u set u.expired = :status where u.email = :email")
    void updateExpiredByEmail(@Param("email") String email, boolean status);

    //@Modifying




}
