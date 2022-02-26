package com.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LocationController {

    private final ObjectMapper objectMapper;

    // POST: /entry (endpoint API)
    public String createEntry(String data) {
        try {
            // EntryDTO requestBody = objectMapper.readValue(data, EntryDTO.class);                                // deserialization      JSON -> EntryDTO
            // Entry savedEntry = entryService.createEntry(requestBody.getTitle(), requestBody.getContent());      // service layer        String, String -> Entry
            // EntryDTO responseBody = mapToEntryDTO(savedEntry);                                                  // mapper               Entry -> EntryDTO
            // return objectMapper.writeValueAsString(responseBody);                                               // serialization        EntryDTO -> JSON
            return "";
        } catch (Exception e) {
            return String.format("{\"message\":\"%s\"}", e.getMessage());                                       // exception handling   Exception -> JSON
        }
    }

    // GET: /entry (endpoint API)
    public String getEntries() {
//        try {
//            List<Entry> entries = entryService.getEntries();
//            List<EntryDTO> mappedEntries = entries.stream()
//                    .map(this::mapToEntryDTO)
//                    .collect(Collectors.toList());
//
//            return objectMapper.writeValueAsString(mappedEntries);
//        } catch (Exception e) {
//            return String.format("{\"message\":\"%s\"}", e.getMessage());                                       // exception handling   Exception -> JSON
//        }
        return "";
    }
}