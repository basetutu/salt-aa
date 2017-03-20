package saltaa;

import com.iwebpp.crypto.TweetNaclFast;

public class JavaSaltLib implements SaltLib {

    @Override
    public void crypto_sign_keypair_seeded(byte[] pk, byte[] sk) {
        TweetNaclFast.crypto_sign_keypair(pk, sk, true);
    }

    @Override
    public void crypto_sign(byte[] sm, byte[] m, byte[] sk) {
        long dummy = 0;
        TweetNaclFast.crypto_sign(sm, dummy, m, 0, m.length, sk);
    }

    @Override
    public void crypto_sign_open(byte[] m, byte[] sm, byte[] pk) {
        long dummy = 0;
        TweetNaclFast.crypto_sign_open(m, dummy, sm, 0, sm.length, pk);
    }
}
