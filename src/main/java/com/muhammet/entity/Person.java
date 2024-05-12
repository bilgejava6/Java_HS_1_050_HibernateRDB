package com.muhammet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer age;
    /**
     * DİKKAT!!!!
     * Personel ile departman arasında bir ilişkiyi mantık
     * olarak kurabilir  ve verileri sorgulayarak çekebiliriz.
     * Long department_id;
     * oluşturarak personelin departman bilgisini çekebilir
     * yada departmanda çalışan personelleri department_id
     * ile listeleye biliriz ancak bu işlem mantık yapısı
     * ile kodlanarak gelebilir. Bunu Hibernate ile
     * oluşturmak mümkündür. Yani bu mantığı hibernate e
     * iletmek ve bu şekilde kurgulamasını sağlamak mümkündür.
     *
     */
    /**
     * fetch -> İlişkisel tablolarda verilerin çekilme şeklini tanımlar.
     * LAZY Load-> geç bağlanma, önce ana tabloya select atılır gerekli olduğunda yani ilişkisel
     * tablo kullanılmak istenildiğinde ilgili tabloya select atılarak veri çekilir
     * EAGER Load-> erken bağlanma, ilişkili olunan tüm tablolara select atılarak önce tüm data
     * çekilir sona işlem yapılır.
     */
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "baglandigim_kolon_icin_id_yazdim")
    Department department;

    @ManyToMany(mappedBy = "personList",fetch = FetchType.LAZY)
    List<Address> addressList;


//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Person{");
//        sb.append("id=").append(id);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", age=").append(age);
////        sb.append(", department=").append(department);
//        sb.append('}');
//        return sb.toString();
//    }
}
