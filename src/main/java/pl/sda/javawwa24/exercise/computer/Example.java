package pl.sda.javawwa24.exercise.computer;

import java.util.GregorianCalendar;
import java.util.Optional;

final class Example {
    public static void main(String[] args) {

       Computer fullComputer = new Computer(new GrahpicsCard(new Chip("nViidia")));
       Computer withoutGC = new Computer(null);
       Computer fake = null;

//       printChipVendorNaive(fullComputer);
//       printChipVendorNaive(withoutGC);
//       printChipVendorNaive(fake);

        printChipVendorSafeWay(fullComputer);
        printChipVendorSafeWay(withoutGC);
        printChipVendorSafeWay(fake);




    }

//    static void printChipVendorOptionalWay (Computer computer) {
//        Optional.ofNullable(computer)
//                .map(computer1 -> computer1.getGrahpicsCard())
//                .map(grahpicsCard -> grahpicsCard.getChip())
//                .map(chip -> chip.getVendor())
//                .ifPresent(s -> System.out.println("Vendor (optional): " + s));
//    }


    static void printChipVendorOptionalWay (Computer computer) {
        Optional.ofNullable(computer)
                .map(Computer::getGrahpicsCard)
                .map(GrahpicsCard::getChip)
                .map(Chip::getVendor)
                .ifPresent(System.out::println);
    }


    static  void printChipVendorNaive(Computer computer) {
//        System.out.println("Vendor: " + computer.getGrahpicsCard().getChip().getVendor());
        System.out.println("Vendor: " + computer.getGrahpicsCard().getChip().getVendor());
    }

    static void printChipVendorSafeWay (Computer computer) {
        if (computer != null) {
            GrahpicsCard grahpicsCard = computer.getGrahpicsCard();
            if (grahpicsCard != null) {
                Chip chip = grahpicsCard.getChip();
                if (chip != null) {
                    System.out.println("Graphic card vendor (safe way)" + chip.getVendor());
                }
            }
        }
    }

}
