
package models.application;

import models.bo.PrimaryBaseDo;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

import javax.persistence.*;

/**
 * Data object for Unit entity record
 *
 * @author <a href="santhosh.g@leantaas.com">Santhosh Gandhe</a>
 * @version $Revision: 1.0 $, $Date: Apr 27, 2015
 */

@Entity
@Table(name = "user")
@Audited
public class User extends PrimaryBaseDo {
    
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "last_name")
    private String lastName;

    public User(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        return this.name + " " + this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
