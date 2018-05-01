package com.cloud.model;
package com.cloud.repository;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.cloud.model.Attendee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Entity
@Table(name="attendee", schema = "public")
@Repository
public interface AttendeeRepository extends CrudRepository {

}

public class Attendee {
    @Id
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
