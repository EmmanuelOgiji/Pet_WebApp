package org.ECSDigital.EmmanuelOgiji;

public class Resources {
    public static  String getCompetitions(){ return "/competitions"; }
    public static  String getTeams(String compId){ return "/competitions/"+compId+"/teams"; }
    public static String backup(){
        return "{\n" +
                "    \"count\": 147,\n" +
                "    \"filters\": {},\n" +
                "    \"competitions\": [\n" +
                "        {\n" +
                "            \"id\": 2006,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2001,\n" +
                "                \"name\": \"Africa\"\n" +
                "            },\n" +
                "            \"name\": \"WC Qualification\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 7,\n" +
                "                \"startDate\": \"2015-10-07\",\n" +
                "                \"endDate\": \"2017-11-14\",\n" +
                "                \"currentMatchday\": 6,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-04T23:54:04Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2023,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2011,\n" +
                "                \"name\": \"Argentina\"\n" +
                "            },\n" +
                "            \"name\": \"Primera B Nacional\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 295,\n" +
                "                \"startDate\": \"2018-08-25\",\n" +
                "                \"endDate\": \"2019-04-20\",\n" +
                "                \"currentMatchday\": 14,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-13T19:00:17Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2024,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2011,\n" +
                "                \"name\": \"Argentina\"\n" +
                "            },\n" +
                "            \"name\": \"Superliga Argentina\",\n" +
                "            \"code\": \"ASL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 282,\n" +
                "                \"startDate\": \"2018-08-11\",\n" +
                "                \"endDate\": \"2019-04-07\",\n" +
                "                \"currentMatchday\": 16,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-25T00:00:20Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2025,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2011,\n" +
                "                \"name\": \"Argentina\"\n" +
                "            },\n" +
                "            \"name\": \"Supercopa Argentina\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 27,\n" +
                "                \"startDate\": \"2018-03-15\",\n" +
                "                \"endDate\": \"2018-03-15\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": {\n" +
                "                    \"id\": 2069,\n" +
                "                    \"name\": \"CA River Plate\",\n" +
                "                    \"shortName\": \"River Plate\",\n" +
                "                    \"tla\": \"RIV\",\n" +
                "                    \"crestUrl\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-04T23:54:32Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2008,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2015,\n" +
                "                \"name\": \"Australia\"\n" +
                "            },\n" +
                "            \"name\": \"A League\",\n" +
                "            \"code\": \"AAL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 283,\n" +
                "                \"startDate\": \"2018-10-19\",\n" +
                "                \"endDate\": \"2019-04-28\",\n" +
                "                \"currentMatchday\": 16,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-25T12:29:41Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2026,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2015,\n" +
                "                \"name\": \"Australia\"\n" +
                "            },\n" +
                "            \"name\": \"FFA Cup\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 28,\n" +
                "                \"startDate\": \"2018-02-10\",\n" +
                "                \"endDate\": \"2018-08-29\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": {\n" +
                "                    \"id\": 1833,\n" +
                "                    \"name\": \"Adelaide United FC\",\n" +
                "                    \"shortName\": \"Adelaide Utd\",\n" +
                "                    \"tla\": \"ADE\",\n" +
                "                    \"crestUrl\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-10-30T12:09:45Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2027,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2016,\n" +
                "                \"name\": \"Austria\"\n" +
                "            },\n" +
                "            \"name\": \"ÖFB Cup\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 162,\n" +
                "                \"startDate\": \"2018-07-20\",\n" +
                "                \"endDate\": \"2019-05-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-11-01T15:26:04Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2012,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2016,\n" +
                "                \"name\": \"Austria\"\n" +
                "            },\n" +
                "            \"name\": \"Bundesliga\",\n" +
                "            \"code\": \"ABL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 208,\n" +
                "                \"startDate\": \"2018-07-27\",\n" +
                "                \"endDate\": \"2019-03-17\",\n" +
                "                \"currentMatchday\": 19,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-17T21:45:05Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2020,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2016,\n" +
                "                \"name\": \"Austria\"\n" +
                "            },\n" +
                "            \"name\": \"Erste Liga\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 161,\n" +
                "                \"startDate\": \"2018-07-27\",\n" +
                "                \"endDate\": \"2019-06-01\",\n" +
                "                \"currentMatchday\": 16,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-11-25T15:18:43Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2022,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2016,\n" +
                "                \"name\": \"Austria\"\n" +
                "            },\n" +
                "            \"name\": \"Playoffs 1/2\",\n" +
                "            \"code\": \"APL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 24,\n" +
                "                \"startDate\": \"2018-05-31\",\n" +
                "                \"endDate\": \"2018-06-03\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": {\n" +
                "                    \"id\": 2022,\n" +
                "                    \"name\": \"SKN Sankt Pölten\",\n" +
                "                    \"shortName\": \"St. Pölten\",\n" +
                "                    \"tla\": \"STP\",\n" +
                "                    \"crestUrl\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-08-23T15:47:33Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2028,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Coupe de Belgique\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 166,\n" +
                "                \"startDate\": \"2018-07-29\",\n" +
                "                \"endDate\": \"2019-05-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-24T22:37:41Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2032,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Playoffs II\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 34,\n" +
                "                \"startDate\": \"2018-03-31\",\n" +
                "                \"endDate\": \"2018-05-23\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-02T13:08:02Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2033,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Division 1B\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 164,\n" +
                "                \"startDate\": \"2018-08-03\",\n" +
                "                \"endDate\": \"2019-03-01\",\n" +
                "                \"currentMatchday\": 23,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-20T17:52:03Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2009,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Jupiler Pro League\",\n" +
                "            \"code\": \"BJL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 163,\n" +
                "                \"startDate\": \"2018-07-27\",\n" +
                "                \"endDate\": \"2019-03-17\",\n" +
                "                \"currentMatchday\": 23,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-21T14:35:07Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2010,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Supercoupe de Belgique\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 165,\n" +
                "                \"startDate\": \"2018-07-22\",\n" +
                "                \"endDate\": \"2018-07-22\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-06-04T23:58:10Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2034,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2028,\n" +
                "                \"name\": \"Bolivia\"\n" +
                "            },\n" +
                "            \"name\": \"LFPB\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 427,\n" +
                "                \"startDate\": \"2019-01-20\",\n" +
                "                \"endDate\": \"2019-12-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-21T14:45:07Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2035,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2030,\n" +
                "                \"name\": \"Bosnia and Herzegovina\"\n" +
                "            },\n" +
                "            \"name\": \"Premier Liga\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 167,\n" +
                "                \"startDate\": \"2018-07-21\",\n" +
                "                \"endDate\": \"2019-02-09\",\n" +
                "                \"currentMatchday\": 20,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-03T17:20:08Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2036,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Série C\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 38,\n" +
                "                \"startDate\": \"2018-04-14\",\n" +
                "                \"endDate\": \"2018-08-28\",\n" +
                "                \"currentMatchday\": 18,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-09-24T02:30:06Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2029,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Série B\",\n" +
                "            \"code\": \"BSB\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 31,\n" +
                "                \"startDate\": \"2018-04-14\",\n" +
                "                \"endDate\": \"2018-11-24\",\n" +
                "                \"currentMatchday\": 38,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-11-25T20:25:17Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2037,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Copa do Brasil\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 39,\n" +
                "                \"startDate\": \"2018-01-30\",\n" +
                "                \"endDate\": \"2018-08-17\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-10-19T23:40:00Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2013,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Série A\",\n" +
                "            \"code\": \"BSA\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_ONE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 15,\n" +
                "                \"startDate\": \"2018-04-14\",\n" +
                "                \"endDate\": \"2018-12-02\",\n" +
                "                \"currentMatchday\": 38,\n" +
                "                \"winner\": {\n" +
                "                    \"id\": 1776,\n" +
                "                    \"name\": \"São Paulo FC\",\n" +
                "                    \"shortName\": \"São Paulo\",\n" +
                "                    \"tla\": \"SAO\",\n" +
                "                    \"crestUrl\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-12-03T22:10:11Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2038,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Série D\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 40,\n" +
                "                \"startDate\": \"2018-04-21\",\n" +
                "                \"endDate\": \"2018-08-04\",\n" +
                "                \"currentMatchday\": 6,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-04T23:59:34Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2040,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2035,\n" +
                "                \"name\": \"Bulgaria\"\n" +
                "            },\n" +
                "            \"name\": \"A PFG\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 168,\n" +
                "                \"startDate\": \"2018-07-20\",\n" +
                "                \"endDate\": \"2019-03-16\",\n" +
                "                \"currentMatchday\": 21,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-17T21:50:05Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2039,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2035,\n" +
                "                \"name\": \"Bulgaria\"\n" +
                "            },\n" +
                "            \"name\": \"Kupa na Bulgarija\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 419,\n" +
                "                \"startDate\": \"2018-09-25\",\n" +
                "                \"endDate\": \"2019-05-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:00:10Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2041,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2040,\n" +
                "                \"name\": \"Canada\"\n" +
                "            },\n" +
                "            \"name\": \"Canadian Championship\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 43,\n" +
                "                \"startDate\": \"2018-06-07\",\n" +
                "                \"endDate\": \"2018-08-16\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:01:12Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2048,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2045,\n" +
                "                \"name\": \"Chile\"\n" +
                "            },\n" +
                "            \"name\": \"Primera División\",\n" +
                "            \"code\": \"CPD\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 51,\n" +
                "                \"startDate\": \"2018-02-03\",\n" +
                "                \"endDate\": \"2018-12-01\",\n" +
                "                \"currentMatchday\": 30,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-03T21:15:11Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2042,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2045,\n" +
                "                \"name\": \"Chile\"\n" +
                "            },\n" +
                "            \"name\": \"Playoffs 1/2\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 44,\n" +
                "                \"startDate\": \"2017-11-25\",\n" +
                "                \"endDate\": \"2017-12-21\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:01:23Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2043,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2045,\n" +
                "                \"name\": \"Chile\"\n" +
                "            },\n" +
                "            \"name\": \"Supercopa de Chile\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 45,\n" +
                "                \"startDate\": \"2018-01-26\",\n" +
                "                \"endDate\": \"2018-01-26\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:01:51Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2044,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2046,\n" +
                "                \"name\": \"China PR\"\n" +
                "            },\n" +
                "            \"name\": \"Chinese Super League\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 46,\n" +
                "                \"startDate\": \"2018-03-02\",\n" +
                "                \"endDate\": \"2018-11-12\",\n" +
                "                \"currentMatchday\": 30,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-11-11T17:31:36Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2045,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2049,\n" +
                "                \"name\": \"Colombia\"\n" +
                "            },\n" +
                "            \"name\": \"Liga Postobón\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 47,\n" +
                "                \"startDate\": \"2018-02-03\",\n" +
                "                \"endDate\": \"2018-11-11\",\n" +
                "                \"currentMatchday\": 19,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-12-17T20:25:07Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2046,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2049,\n" +
                "                \"name\": \"Colombia\"\n" +
                "            },\n" +
                "            \"name\": \"Superliga de Colombia\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 48,\n" +
                "                \"startDate\": \"2018-02-01\",\n" +
                "                \"endDate\": \"2018-02-08\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:02:32Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2047,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2058,\n" +
                "                \"name\": \"Croatia\"\n" +
                "            },\n" +
                "            \"name\": \"Prva Liga\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 170,\n" +
                "                \"startDate\": \"2018-07-27\",\n" +
                "                \"endDate\": \"2019-05-25\",\n" +
                "                \"currentMatchday\": 18,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-17T21:45:05Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2049,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2062,\n" +
                "                \"name\": \"Czech Republic\"\n" +
                "            },\n" +
                "            \"name\": \"Synot Liga\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 171,\n" +
                "                \"startDate\": \"2018-07-20\",\n" +
                "                \"endDate\": \"2019-04-27\",\n" +
                "                \"currentMatchday\": 20,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-18T16:35:01Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2141,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2065,\n" +
                "                \"name\": \"Denmark\"\n" +
                "            },\n" +
                "            \"name\": \"Play Offs 1/2\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": null,\n" +
                "            \"numberOfAvailableSeasons\": 0,\n" +
                "            \"lastUpdated\": \"2018-07-13T13:34:22Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2050,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2065,\n" +
                "                \"name\": \"Denmark\"\n" +
                "            },\n" +
                "            \"name\": \"Superliga\",\n" +
                "            \"code\": \"DSU\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 172,\n" +
                "                \"startDate\": \"2018-07-13\",\n" +
                "                \"endDate\": \"2019-03-17\",\n" +
                "                \"currentMatchday\": 21,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-18T16:35:01Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2051,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2065,\n" +
                "                \"name\": \"Denmark\"\n" +
                "            },\n" +
                "            \"name\": \"DBU Pokalen\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 173,\n" +
                "                \"startDate\": \"2018-08-07\",\n" +
                "                \"endDate\": \"2019-05-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-06T02:05:03Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2052,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2069,\n" +
                "                \"name\": \"Ecuador\"\n" +
                "            },\n" +
                "            \"name\": \"Copa Pilsener Serie A\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 55,\n" +
                "                \"startDate\": \"2018-02-17\",\n" +
                "                \"endDate\": \"2018-12-09\",\n" +
                "                \"currentMatchday\": 22,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-12-17T21:50:05Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2055,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"FA Cup\",\n" +
                "            \"code\": \"FAC\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 207,\n" +
                "                \"startDate\": \"2018-08-10\",\n" +
                "                \"endDate\": \"2019-05-18\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-25T12:05:08Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2056,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"FA Community Shield\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 60,\n" +
                "                \"startDate\": \"2018-08-05\",\n" +
                "                \"endDate\": \"2018-08-05\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:05:10Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2016,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Championship\",\n" +
                "            \"code\": \"ELC\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_ONE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 154,\n" +
                "                \"startDate\": \"2018-08-03\",\n" +
                "                \"endDate\": \"2019-05-05\",\n" +
                "                \"currentMatchday\": 29,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-22T22:30:02Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2139,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Football League Cup\",\n" +
                "            \"code\": \"FLC\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 176,\n" +
                "                \"startDate\": \"2018-08-14\",\n" +
                "                \"endDate\": \"2019-02-24\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-25T11:15:00Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2053,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"National League\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 174,\n" +
                "                \"startDate\": \"2018-08-04\",\n" +
                "                \"endDate\": \"2019-04-27\",\n" +
                "                \"currentMatchday\": 31,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-20T18:05:11Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2021,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Premier League\",\n" +
                "            \"code\": \"PL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_ONE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 151,\n" +
                "                \"startDate\": \"2018-08-10\",\n" +
                "                \"endDate\": \"2019-05-12\",\n" +
                "                \"currentMatchday\": 24,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 26,\n" +
                "            \"lastUpdated\": \"2019-01-21T12:45:04Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2030,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"League One\",\n" +
                "            \"code\": \"EL1\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 152,\n" +
                "                \"startDate\": \"2018-08-04\",\n" +
                "                \"endDate\": \"2019-05-04\",\n" +
                "                \"currentMatchday\": 30,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 10,\n" +
                "            \"lastUpdated\": \"2019-01-23T12:10:02Z\"\n" +
                "        }]}";
    }
}
