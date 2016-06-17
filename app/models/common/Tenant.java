package models.common;

import javax.persistence.*;

/**
 * Created by eric on 6/16/16.
 */
@Entity
@Table(name = "com_tenant")
public class Tenant {

    @Id
    @Column(name = "tenant_id")
    private String id;

    @Column(name = "tenant_name")
    private String name;

    public Tenant(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String tenantName) {
        this.name = tenantName;
    }
}
