package com.everisbootcamp.createaccount.Data;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
@Document(collection = "accounts")
public class Account {

    @Id
    private String idaccount;

    private String numberaccount;

    private String idcustomer;
    private String typeaccount;
    private Double amount;

    private Map<String, Object> rules;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private String datecreated;

    public Account(String idcustomer, String typeaccount, Double amount) {
        this.idcustomer = idcustomer;
        this.typeaccount = typeaccount;
        this.amount = amount;
    }
}
