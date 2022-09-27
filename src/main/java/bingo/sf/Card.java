/*
    SF Bingo - A simple CLI app emulating a bingo game

    Hosted on https://github.com/egalli64/jex
 */
package bingo.sf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * The card for a game
 */
public class Card {
    private static final Logger logger = LoggerFactory.getLogger(Card.class);
    /**
     * rows in each card
     */
    private static final int ROW_NR = 3;
    /**
     * size of each row
     */
    private static final int ROW_SZ = 5;

    /**
     * the card's rows
     */
    private final List<CardRow> rows;

    /**
     * Take care of initializing its rows using the passed generator
     *
     * @param extractor the number provider
     */
    public Card(Extractor extractor) {
        rows = new ArrayList<>(ROW_NR);
        for (int i = 0; i < ROW_NR; i++) {
            List<Integer> row = new ArrayList<>(ROW_SZ);
            for (int j = 0; j < ROW_SZ; j++) {
                row.add(extractor.extract());
            }
            rows.add(new CardRow(row));
        }
        logger.trace("Generated card {}", this);
    }

    /**
     * Is an extracted number in this card?
     *
     * @param number the value to be checked
     * @return if found (and win) or not found
     */
    public Result check(int number) {
        for (CardRow row : rows) {
            int result = row.check(number);
            if (result != 0) {
                logger.trace("Found {} in row {}", number, row);
                return result == ROW_SZ ? Result.WIN : Result.FOUND;
            }
        }
        return Result.MISSED;
    }

    @Override
    public String toString() {
        return rows.toString();
    }
}
