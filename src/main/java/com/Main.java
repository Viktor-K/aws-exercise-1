package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Integer STAIR_SIZE = getStairSizeParam(args);
        List<Integer> POSSIBLE_STEP = getStairStepsParam(args);
        if (STAIR_SIZE != null && POSSIBLE_STEP != null) {

            System.out.println(
                    String.format("Possibles ways for STAIR SIZE %s and POSSIBLES STEP = %s",
                            STAIR_SIZE,
                            POSSIBLE_STEP.toString()
                    ));

            Results results = new StairClimber().climbStair(
                    STAIR_SIZE,
                    0,
                    new ArrayList<>(),
                    new Results(),
                    POSSIBLE_STEP
            );

            results.getPossibleWays().forEach(it -> System.out.println(it.toString()));
        }
    }


    private static Integer getStairSizeParam(String[] args) {
        String argStairSize = args[0];

        if (argStairSize != null) {
            try {
                return Integer.valueOf(argStairSize);
            } catch (Exception e) {
                System.out.println(String.format("Invalid param for stair size %s", argStairSize));
            }
        } else {
            System.out.println("param for stair size is null");
        }

        return null;
    }

    private static List<Integer> getStairStepsParam(String[] args) {
        String argStepsList = args[1];

        if (argStepsList != null) {
            try {
                return Stream.of(argStepsList.split(","))
                        .map(Integer::valueOf)
                        .collect(Collectors.toList());

            } catch (Exception e) {
                System.out.println(String.format("Invalid param for steps (Use separator , between int values) %s", argStepsList));
            }
        } else {
            System.out.println("param for steps is null (Use separator , between int values) ");
        }

        return null;
    }

}
