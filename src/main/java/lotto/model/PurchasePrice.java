package lotto.model;

public class PurchasePrice {

    private final int PIECE_OF_LOTTO;
    private static final int LOTTO_PRICE_EACH = 1000;

    public PurchasePrice(String PIECE_OF_LOTTO){
        isUnder1000(PIECE_OF_LOTTO);
        isNotDivisibleBy1000(PIECE_OF_LOTTO);
        this.PIECE_OF_LOTTO = Integer.parseInt(PIECE_OF_LOTTO) / 1000;
    }

    public int getCountPieceOfLotto(){
        return this.PIECE_OF_LOTTO;
    }

    private void isUnder1000(String purchasePrice) throws IllegalArgumentException{
        if(Integer.parseInt(purchasePrice) < LOTTO_PRICE_EACH){
            throw new IllegalArgumentException("[ERROR] 로또 한장은 1000원입니다.");
        }

    }
    private void isNotDivisibleBy1000(String purchasePrice) throws IllegalArgumentException{
        if(Integer.parseInt(purchasePrice) % 1000 != 0){
            throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 1000으로 나누어 떨어져야 합니다.");
        }
    }
}
