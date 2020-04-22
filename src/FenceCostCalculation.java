import java.util.Scanner;

import static java.lang.String.format;

public class FenceCostCalculation {
    public static void main(String[] args) {

        Scanner keybd = new Scanner(System.in);

        double fence_perimeter = 0.0;
        double chain_link_length = 0.0;
        int number_of_gates = 0;

        double wooden_fence_cost_per_ft = 25.00;
        double chain_link_cost_per_ft = 15.00;
        double gate_cost = 150.00;
        double building_permit_cost = 50.00;
        double tax_rate = 6;

        double sum_taxable_items = 0.00;
        double tax_amount = 0.00;
        double wooden_fence_cost = 0.00;
        double chain_link_cost = 0.00;
        double all_gates_cost = 0.00;
        double total_fence_installing_cost = 0.00;

        boolean cont1 = true;
        boolean cont2 = true;

        //enter and validate fence perimeter
        do{
            System.out.print("Enter fence perimeter: ");
            fence_perimeter = keybd.nextDouble();
            keybd.nextLine();
            if(fence_perimeter < 0){
                System.out.println("Invalid value.");
            }
            else{
                cont1 = false;
            }

        }while(cont1 == true);

        //enter and validate number of gates
        do{
            System.out.print("Enter number of Gates: ");
            number_of_gates = keybd.nextInt();
            keybd.nextLine();
            if(number_of_gates < 0){
                System.out.println("Invalid value.");
            }
            else if(number_of_gates > 3){
                System.out.println("Number of Gates can't be greater than 3.");
            }
            else{
                cont2 = false;
            }
        }while(cont2 == true);

        //PROCESS
        chain_link_length = fence_perimeter;
        wooden_fence_cost = fence_perimeter * wooden_fence_cost_per_ft;
        chain_link_cost = chain_link_length * chain_link_cost_per_ft;
        all_gates_cost = number_of_gates * gate_cost;
        sum_taxable_items = wooden_fence_cost + chain_link_cost + all_gates_cost;
        tax_amount = sum_taxable_items * tax_rate / 100;
        total_fence_installing_cost = sum_taxable_items + tax_amount + building_permit_cost;

        //OUTPUT
        System.out.println(format("\n%1s %-40s %50s %21s", "|", "FENCE COST CALCULATION SUMMARY PAGE", "Date: mm/dd/yyyy", "||"));
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println(format("%1s %-5s %1s %-35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", " No.", "|", "Description", "|", "Unit   ", "|", "Qty.    ", "|", "Rate  ", "|", "Amount    ", "||"));
        System.out.println("==================================================================================================================");
        System.out.println(format("%1s %-5s %1s %-35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", " 1", "|", "Wooden Fence", "|", "foot   ", "|", String.format("%(,.2f", fence_perimeter), "|", String.format("$%(,.2f", wooden_fence_cost_per_ft), "|", String.format("$%(,.2f", wooden_fence_cost), "||"));
        System.out.println(format("%1s %-5s %1s %-35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", " 2", "|", "Chain-link fence", "|", "foot   ", "|", String.format("%(,.2f", chain_link_length), "|", String.format("$%(,.2f", chain_link_cost_per_ft), "|", String.format("$%(,.2f", chain_link_cost), "||"));
        System.out.println(format("%1s %-5s %1s %-35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", " 3", "|", "Gates", "|", "No    ", "|", number_of_gates, "|", String.format("$%(,.2f", gate_cost), "|", String.format("$%(,.2f", all_gates_cost), "||"));

        System.out.println(format("%1s %-5s %1s %35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", "  ", "|", "", "|", " ", "|", "", "|", "", "|", "", "||"));
        System.out.println(format("%1s %-5s %1s %35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", "  ", "|", "", "|", " ", "|", "", "|", "", "|", "", "||"));
        System.out.println(format("%1s %-5s %1s %35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", "  ", "|", "Sum of Taxable itmes", "|", " ", "|", "", "|", "", "|", String.format("$%(,.2f", sum_taxable_items), "||"));
        System.out.println(format("%1s %-5s %1s %35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", "  ", "|", "tax (" + tax_rate + "%)", "|", " ", "|", "", "|", "", "|", String.format("$%(,.2f", tax_amount), "||"));

        System.out.println(format("%1s %-5s %1s %-35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", " 4", "|", "Building Permit cost", "|", "ls    ", "|", "1", "|", String.format("$%(,.2f", building_permit_cost), "|", String.format("$%(,.2f", building_permit_cost), "||"));
        System.out.println(format("%1s %-5s %1s %35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", "  ", "|", "", "|", " ", "|", "", "|", "", "|", "----------", "||"));

        System.out.println(format("%1s %-5s %1s %35s %1s %10s %1s %15s %1s %10s %1s %20s %1s", "|", " ", "|", "Total Fence Installing sum: ", "|", " ", "|", "", "|", "", "|", String.format("$%(,.2f", total_fence_installing_cost), "||"));
        System.out.println("==================================================================================================================");

    }
}
