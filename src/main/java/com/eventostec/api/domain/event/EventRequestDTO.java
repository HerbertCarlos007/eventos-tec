package com.eventostec.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record EventRequestDTO(String title, String description, String eventUrl, MultipartFile image, Long date, Boolean remote, String city, String state) {
}
