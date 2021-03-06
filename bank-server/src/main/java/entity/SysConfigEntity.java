package entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_config", schema = "bank_manage", catalog = "")
public class SysConfigEntity {
    private Long id;
    private String confKey;
    private String value;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "conf_key", nullable = false, length = 255)
    public String getConfKey() {
        return confKey;
    }

    public void setConfKey(String confKey) {
        this.confKey = confKey;
    }

    @Basic
    @Column(name = "value", nullable = false, length = 1000)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysConfigEntity that = (SysConfigEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (confKey != null ? !confKey.equals(that.confKey) : that.confKey != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (confKey != null ? confKey.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
