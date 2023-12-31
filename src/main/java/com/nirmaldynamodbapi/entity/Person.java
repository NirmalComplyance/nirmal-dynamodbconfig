package com.nirmaldynamodbapi.entity;


import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.nirmaldynamodbapi.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "test_usage")

public class Person {

    @DynamoDBHashKey (attributeName = "user_id")
    @DynamoDBAutoGeneratedKey
    private String personId;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private int age;

    @DynamoDBAttribute
    private String email;

    private Address address;
}
