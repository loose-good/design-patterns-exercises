package p9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Circle implements Exportable {
   private Point center;
   private double radius;

   @Override
   public String export(Formatter formatter) {
      if(formatter instanceof CircleFormatter)
         return ((CircleFormatter)formatter).format(this);
      else
         throw new UnsupportedOperationException();
   }
}
