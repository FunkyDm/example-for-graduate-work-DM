package ru.skypro.homework.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.AdDTO;
import ru.skypro.homework.dto.CreateOrUpdateAdDTO;

@RestController
@RequestMapping("/ads")
public class AdController {
    @GetMapping
    public ResponseEntity<?> getAllAds() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> postAdd(@RequestBody AdDTO adDTO) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAddInfo(@PathVariable Integer id) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdd(@PathVariable Integer id) {
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateAddInfo(@PathVariable Integer id,
                                           @RequestBody CreateOrUpdateAdDTO updateAd) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/me")
    public ResponseEntity<?> getAuthUserAdds() {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}/image")
    public ResponseEntity<?> updateAddImage(@PathVariable Integer id,
                                            @RequestBody String image) {
        return ResponseEntity.ok().build();
    }

}
