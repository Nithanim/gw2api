package me.nithanim.gw2api.v2.api.traits.facttypes;

import java.util.Objects;
import me.nithanim.gw2api.v2.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.ToString
public class ComboFinisherFact extends FactBase {
    private FinisherType finisherType;
    private int percent;

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 37 * hash + Objects.hashCode(this.finisherType);
        hash = 37 * hash + this.percent;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ComboFinisherFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final ComboFinisherFact other = (ComboFinisherFact) obj;
        return Objects.equals(this.finisherType, other.finisherType)
            && this.percent == other.percent;
    }

    public static enum FinisherType {
        BLAST, LEAP, PROJECTILE, WHIRL;
    }
}
