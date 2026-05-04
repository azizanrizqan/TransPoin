package com.TransPoin.TransPoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TransPoin.TransPoin.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}