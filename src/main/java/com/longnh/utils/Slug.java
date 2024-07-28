package com.longnh.utils;

import java.text.Normalizer;

public class Slug {
  public static String makeSlug(String input) {
    if (input == null || input.isEmpty()) {
      return "";
    }
    input = input.trim();
    String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
    String slug = normalized.replaceAll("\\p{M}", "");
    slug = slug.toLowerCase();
    slug = slug.replaceAll("[^a-z0-9\\s]", "").replaceAll("\\s+", "-");
    slug = slug.replaceAll("^-+", "").replaceAll("-+$", "");

    return slug;
  }
}
