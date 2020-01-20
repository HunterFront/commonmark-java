package org.commonmark.renderer.html;

import org.commonmark.node.Image;
import org.commonmark.node.Link;

/**
 * Sanitizes urls for img and a elements by whitelisting protocols.
 * This is intended to prevent XSS payloads like [Click this totally safe url](javascript:document.xss=true;)
 *
 * Implementation based on https://github.com/OWASP/java-html-sanitizer/blob/f07e44b034a45d94d6fd010279073c38b6933072/src/main/java/org/owasp/html/FilterUrlByProtocolAttributePolicy.java
 */
public interface UrlSanitizer {
    /**
     * Sanitize a url for use in the href attribute of a {@link Link}.
     * @param url Link to sanitize
     * @return Sanitized link
     */
    public String sanitizeLinkUrl(String url);

    /**
     * Sanitize a url for use in the src attribute of a {@link Image}.
     * @param url Link to sanitize
     * @return Sanitized link {@link Image}
     */
    public String sanitizeImageUrl(String url);
}
