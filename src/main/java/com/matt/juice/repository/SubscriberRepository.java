package com.matt.juice.repository;

import org.springframework.data.repository.CrudRepository;

import com.matt.juice.model.Subscriber;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

}