package com.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.lbovolini.mapper.ObjectMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class LocationController {

    private final EntryService entryService;                                                                    // dependency inversion
    private final ObjectMapper objectMapper;

    // POST: /entry (endpoint API)
    public String createEntry(String data) {
        try {
            EntryDTO requestBody = objectMapper.readValue(data, EntryDTO.class);                                // deserialization      JSON -> EntryDTO
            Entry savedEntry = entryService.createEntry(requestBody.getTitle(), requestBody.getContent());      // service layer        String, String -> Entry
            EntryDTO responseBody = mapToEntryDTO(savedEntry);                                                  // mapper               Entry -> EntryDTO
            return objectMapper.writeValueAsString(responseBody);                                               // serialization        EntryDTO -> JSON
        } catch (Exception e) {
            return String.format("{\"message\":\"%s\"}", e.getMessage());                                       // exception handling   Exception -> JSON
        }
    }

    // GET: /entry (endpoint API)
    public String getEntries() {
        try {
            List<Entry> entries = entryService.getEntries();
            List<EntryDTO> mappedEntries = entries.stream()
                    .map(this::mapToEntryDTO)
                    .collect(Collectors.toList());

            return objectMapper.writeValueAsString(mappedEntries);
        } catch (Exception e) {
            return String.format("{\"message\":\"%s\"}", e.getMessage());                                       // exception handling   Exception -> JSON
        }
    }

    // mapper
    private EntryDTO mapToEntryDTO(Entry savedEntry) {
        EntryDTO responseBody = new EntryDTO();
        responseBody.setId(savedEntry.getId());
        responseBody.setTitle(savedEntry.getTitle());
        responseBody.setContent(savedEntry.getContent());
        return responseBody;
    }
}