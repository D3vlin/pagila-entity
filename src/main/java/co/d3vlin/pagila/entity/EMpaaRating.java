package co.d3vlin.pagila.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Schema(
        name = "EMpaaRating",
        description = "Mpaa Rating",
        title = "Mpaa Rating"
)
@Getter
public enum EMpaaRating {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17");

    private final String label;
}
