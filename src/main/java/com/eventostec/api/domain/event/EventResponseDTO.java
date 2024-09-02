package com.eventostec.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.UUID;

public record EventResponseDTO(UUID id, String title, String description, String eventUrl, String imgUrl, Date date, Boolean remote, String city, String state) {
}
