package com.rocketseat.createUrlShortener;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter

public class UrlData {
    public String originalUrl;
    public long expirationTime;

    public UrlData(String originalUrl, long expirationTime) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }
}
