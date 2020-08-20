package com.kalemakk.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micrometer.core.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import javax.*;
import java.util.UUID;

public class Person {
    private UUID id;
    private String name;

    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
