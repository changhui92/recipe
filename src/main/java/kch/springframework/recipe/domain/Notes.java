package kch.springframework.recipe.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //no cascade because we do not want recipe to be removed too when notes is deleted
    @OneToOne
    private Recipe recipe;
    //specifying large object
    @Lob
    private String recipeNotes;

}
