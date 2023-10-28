package com.example.biowebsite.dto;

import com.example.biowebsite.model.Category;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;

    private int categoryId;
    private  double price;
    private String description;
    private String imageName;
}
