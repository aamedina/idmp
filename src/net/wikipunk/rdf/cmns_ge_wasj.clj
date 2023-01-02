(ns net.wikipunk.rdf.cmns-ge-wasj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a business perspective."
  {:cmns-av/copyright ["Copyright (c) 2021-2022 Object Management Group, Inc."
                       "Copyright (c) 2021-2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions.rdf",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a business perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/GovernmentEntities/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-ge" "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-ge-wasj"
    "https://www.omg.org/spec/Commons/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://www.omg.org/spec/Commons/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "cmns-ge-wasj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Commons Western Asia Government Entities and Jurisdictions Ontology",
   :skos/note
   "This ontology is derived from the Financial Industry Business Ontology (FIBO) Western Asia Government Entities and Jurisdictions ontology.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def ArmenianEntity
  "sovereign state and polity that is Armenia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Armenia,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheRepublicOfArmenia,
   :db/ident        :cmns-ge-wasj/ArmenianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Armenian entity",
   :skos/definition "sovereign state and polity that is Armenia"})

(def AzerbaijaniEntity
  "sovereign state and polity that is Azerbaijan"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Azerbaijan,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheRepublicOfAzerbaijan,
   :db/ident        :cmns-ge-wasj/AzerbaijaniEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Azerbaijani entity",
   :skos/definition "sovereign state and polity that is Azerbaijan"})

(def BahrainiEntity
  "sovereign state and polity that is Bahrain"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Bahrain,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheKingdomOfBahrain,
   :db/ident        :cmns-ge-wasj/BahrainiEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Bahraini entity",
   :skos/definition "sovereign state and polity that is Bahrain"})

(def CypriotEntity
  "sovereign state and polity that is Cyprus"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Cyprus,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheRepublicOfCyprus,
   :db/ident        :cmns-ge-wasj/CypriotEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Cypriot entity",
   :skos/definition "sovereign state and polity that is Cyprus"})

(def EmiratiEntity
  "federated sovereignty and polity that is the United Arab Emirates"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/UnitedArabEmirates,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheUnitedArabEmirates,
   :db/ident :cmns-ge-wasj/EmiratiEntity,
   :rdf/type [:cmns-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/label "Emirati entity",
   :skos/definition
   "federated sovereignty and polity that is the United Arab Emirates"})

(def GeorgianEntity
  "sovereign state and polity that is Georgia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Georgia,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfGeorgia,
   :db/ident        :cmns-ge-wasj/GeorgianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Georgian entity",
   :skos/definition "sovereign state and polity that is Georgia"})

(def GovernmentOfGeorgia
  "unitary parliamentary constitutional republic in Western Asia, bounded to the west by the Black Sea, to the north and east by Russia, to the south by Turkey and Armenia, and to the southeast by Azerbaijan"
  {:cmns-rga/governs :lcc-3166-1/Georgia,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfGeorgia,
   :db/ident :cmns-ge-wasj/GovernmentOfGeorgia,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ka",
                 :rdf/value    "საქართველო"}
                {:rdf/language "en",
                 :rdf/value    "Government of Georgia"}],
   :skos/definition
   "unitary parliamentary constitutional republic in Western Asia, bounded to the west by the Black Sea, to the north and east by Russia, to the south by Turkey and Armenia, and to the southeast by Azerbaijan"})

(def GovernmentOfTheHashemiteKingdomOfJordan
  "unitary parliamentary constitutional monarchy in Western Asia, located on the East Bank of the Jordan River, bordered by Saudi Arabia, Iraq, Syria, Israel and Palestine (West Bank)"
  {:cmns-rga/governs :lcc-3166-1/Jordan,
   :cmns-rga/hasJurisdiction
   :cmns-ge-wasj/JurisdictionOfTheHashemiteKingdomOfJordan,
   :db/ident :cmns-ge-wasj/GovernmentOfTheHashemiteKingdomOfJordan,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "المملكة الأردنية الهاشمية"}
                {:rdf/language "en",
                 :rdf/value "Government of the Hashemite Kingdom of Jordan"}],
   :skos/definition
   "unitary parliamentary constitutional monarchy in Western Asia, located on the East Bank of the Jordan River, bordered by Saudi Arabia, Iraq, Syria, Israel and Palestine (West Bank)"})

(def GovernmentOfTheKingdomOfBahrain
  "unitary constitutional monarchy in Western Asia, comprising a small archipelago made up of 70 natural islands and an additional 33 artificial islands, centered around Bahrain Island, between the Qatari peninsula and the north eastern coast of Saudi Arabia"
  {:cmns-rga/governs :lcc-3166-1/Bahrain,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheKingdomOfBahrain,
   :db/ident :cmns-ge-wasj/GovernmentOfTheKingdomOfBahrain,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "مملكة البحرين"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Kingdom of Bahrain"}],
   :skos/definition
   "unitary constitutional monarchy in Western Asia, comprising a small archipelago made up of 70 natural islands and an additional 33 artificial islands, centered around Bahrain Island, between the Qatari peninsula and the north eastern coast of Saudi Arabia"})

(def GovernmentOfTheKingdomOfSaudiArabia
  "unitary Islamic absolute monarchy in Western Asia, located on the Arabian Peninsula and bordered by Jordan and Iraq to the north, Kuwait to the northeast, Qatar, Bahrain, and the United Arab Emirates to the east, Oman to the southeast and Yemen to the south"
  {:cmns-rga/governs :lcc-3166-1/SaudiArabia,
   :cmns-rga/hasJurisdiction
   :cmns-ge-wasj/JurisdictionOfTheKingdomOfSaudiArabia,
   :db/ident :cmns-ge-wasj/GovernmentOfTheKingdomOfSaudiArabia,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "ٱلْمَمْلَكَة ٱلْعَرَبِيَّة ٱلسَّعُوْدِيَّة"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Kingdom of Saudi Arabia"}],
   :skos/definition
   "unitary Islamic absolute monarchy in Western Asia, located on the Arabian Peninsula and bordered by Jordan and Iraq to the north, Kuwait to the northeast, Qatar, Bahrain, and the United Arab Emirates to the east, Oman to the southeast and Yemen to the south"})

(def GovernmentOfTheLebaneseRepublic
  "unitary parliamentary confessionalist constitutional republic in Western Asia, bordered by Syria to the north and east and Israel to the south"
  {:cmns-rga/governs :lcc-3166-1/Lebanon,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheLebaneseRepublic,
   :db/ident :cmns-ge-wasj/GovernmentOfTheLebaneseRepublic,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "ٱلْجُمْهُورِيَّةُ ٱللُّبْنَانِيَّةُ"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Lebanese Republic"}],
   :skos/definition
   "unitary parliamentary confessionalist constitutional republic in Western Asia, bordered by Syria to the north and east and Israel to the south"})

(def GovernmentOfTheRepublicOfArmenia
  "unitary parliamentary democratic republic in Western Asia, bordered by Turkey to the west, Georgia to the north, the Lachin corridor under a Russian peacekeeping force, and Azerbaijan to the east, and Iran and the Azerbaijani exclave of Nakhchivan to the south"
  {:cmns-rga/governs :lcc-3166-1/Armenia,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheRepublicOfArmenia,
   :db/ident :cmns-ge-wasj/GovernmentOfTheRepublicOfArmenia,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "hy",
                 :rdf/value    "Հայաստանի Հանրապետություն"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Armenia"}],
   :skos/definition
   "unitary parliamentary democratic republic in Western Asia, bordered by Turkey to the west, Georgia to the north, the Lachin corridor under a Russian peacekeeping force, and Azerbaijan to the east, and Iran and the Azerbaijani exclave of Nakhchivan to the south"})

(def GovernmentOfTheRepublicOfAzerbaijan
  "unitary semi-presidential republic in Western Asia, bounded by the Caspian Sea to the east, the Russian republic of Dagestan to the north, Georgia to the northwest, Armenia and Turkey to the west, and Iran to the south"
  {:cmns-rga/governs :lcc-3166-1/Azerbaijan,
   :cmns-rga/hasJurisdiction
   :cmns-ge-wasj/JurisdictionOfTheRepublicOfAzerbaijan,
   :db/ident :cmns-ge-wasj/GovernmentOfTheRepublicOfAzerbaijan,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of the Republic of Azerbaijan"}
                {:rdf/language "az",
                 :rdf/value    "Azərbaycan Respublikası"}],
   :skos/definition
   "unitary semi-presidential republic in Western Asia, bounded by the Caspian Sea to the east, the Russian republic of Dagestan to the north, Georgia to the northwest, Armenia and Turkey to the west, and Iran to the south"})

(def GovernmentOfTheRepublicOfCyprus
  "unitary presidential constitutional republic in Western Asia, an island nation in the eastern Mediterranean Sea located south of Turkey, west of Syria, northwest of Lebanon, Israel and Palestine, north of Egypt, and southeast of Greece"
  {:cmns-rga/governs :lcc-3166-1/Cyprus,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheRepublicOfCyprus,
   :db/ident :cmns-ge-wasj/GovernmentOfTheRepublicOfCyprus,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "el",
                 :rdf/value    "Κυπριακή Δημοκρατία"}
                {:rdf/language "tr",
                 :rdf/value    "Kıbrıs Cumhuriyeti"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Cyprus"}],
   :skos/definition
   "unitary presidential constitutional republic in Western Asia, an island nation in the eastern Mediterranean Sea located south of Turkey, west of Syria, northwest of Lebanon, Israel and Palestine, north of Egypt, and southeast of Greece"})

(def GovernmentOfTheRepublicOfIraq
  "federal parliamentary constitutional republic in Western Asia, bordered by Turkey to the north, Iran to the east, Kuwait to the southeast, Saudi Arabia to the south, Jordan to the southwest and Syria to the west"
  {:cmns-rga/governs :lcc-3166-1/Iraq,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheRepublicOfIraq,
   :db/ident :cmns-ge-wasj/GovernmentOfTheRepublicOfIraq,
   :rdf/type [:cmns-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ku",
                 :rdf/value    "کۆماری عێراق"}
                {:rdf/language "ar",
                 :rdf/value    "جمهورية العراق"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Iraq"}],
   :skos/definition
   "federal parliamentary constitutional republic in Western Asia, bordered by Turkey to the north, Iran to the east, Kuwait to the southeast, Saudi Arabia to the south, Jordan to the southwest and Syria to the west"})

(def GovernmentOfTheRepublicOfTurkey
  "unitary presidential constitutional republic in Western Asia, bordered by Greece and Bulgaria to the northwest, the Black Sea to the north, Georgia to the northeast, Armenia, Azerbaijan, and Iran to the east, Iraq to the southeast, Syria and the Mediterranean Sea to the south, and the Aegean Sea to the west"
  {:cmns-rga/governs :lcc-3166-1/Turkey,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheRepublicOfTurkey,
   :db/ident :cmns-ge-wasj/GovernmentOfTheRepublicOfTurkey,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "tr",
                 :rdf/value    "Türkiye Cumhuriyeti"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Turkey"}],
   :skos/definition
   "unitary presidential constitutional republic in Western Asia, bordered by Greece and Bulgaria to the northwest, the Black Sea to the north, Georgia to the northeast, Armenia, Azerbaijan, and Iran to the east, Iraq to the southeast, Syria and the Mediterranean Sea to the south, and the Aegean Sea to the west"})

(def GovernmentOfTheRepublicOfYemen
  "unitary presidential constitutional republic (de jure) and unitary provisional government (de facto) in Western Asia located at the southern end of the Arabian Peninsula"
  {:cmns-rga/governs :lcc-3166-1/Yemen,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheRepublicOfYemen,
   :db/ident :cmns-ge-wasj/GovernmentOfTheRepublicOfYemen,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "ٱلْجُمْهُورِيَّةُ ٱلْيَمَنِيَّةُ"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Yemen"}],
   :skos/definition
   "unitary presidential constitutional republic (de jure) and unitary provisional government (de facto) in Western Asia located at the southern end of the Arabian Peninsula"})

(def GovernmentOfTheStateOfIsrael
  "unitary parliamentary constitutional republic in Western Asia, bordering Lebanon to the north, Syria to the northeast, Jordan on the east, the Palestinian territories of the West Bank and the Gaza Strip to the east and west, respectively, and Egypt to the southwest"
  {:cmns-rga/governs :lcc-3166-1/Israel,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheStateOfIsrael,
   :db/ident :cmns-ge-wasj/GovernmentOfTheStateOfIsrael,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "إسرائيل"}
                {:rdf/language "he",
                 :rdf/value    "יִשְׂרָאֵל"}
                {:rdf/language "en",
                 :rdf/value    "Government of the State of Israel"}],
   :skos/definition
   "unitary parliamentary constitutional republic in Western Asia, bordering Lebanon to the north, Syria to the northeast, Jordan on the east, the Palestinian territories of the West Bank and the Gaza Strip to the east and west, respectively, and Egypt to the southwest"})

(def GovernmentOfTheStateOfKuwait
  "unitary constitutional monarchy in Western Asia, located at the tip of the Persian Gulf, bordering Iraq to the north and Saudi Arabia to the south"
  {:cmns-rga/governs :lcc-3166-1/Kuwait,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheStateOfKuwait,
   :db/ident :cmns-ge-wasj/GovernmentOfTheStateOfKuwait,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "دولة الكويت"}
                {:rdf/language "en",
                 :rdf/value    "Government of the State of Kuwait"}],
   :skos/definition
   "unitary constitutional monarchy in Western Asia, located at the tip of the Persian Gulf, bordering Iraq to the north and Saudi Arabia to the south"})

(def GovernmentOfTheStateOfPalestine
  "unitary semi-presidential republic that is a de jure sovereign state in Western Asia claiming the West Bank (bordering Israel and Jordan) and Gaza Strip (bordering Israel and Egypt)"
  {:cmns-rga/governs :lcc-3166-1/Palestine,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheStateOfPalestine,
   :db/ident :cmns-ge-wasj/GovernmentOfTheStateOfPalestine,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "دولة فلسطين"}
                {:rdf/language "en",
                 :rdf/value    "Government of the State of Palestine"}],
   :skos/definition
   "unitary semi-presidential republic that is a de jure sovereign state in Western Asia claiming the West Bank (bordering Israel and Jordan) and Gaza Strip (bordering Israel and Egypt)"})

(def GovernmentOfTheStateOfQatar
  "unitary semi-constitutional monarchy in Western Asia, occupying the small Qatar Peninsula on the northeastern coast of the Arabian Peninsula and bordered by Saudi Arabia to the south"
  {:cmns-rga/governs :lcc-3166-1/Qatar,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheStateOfQatar,
   :db/ident :cmns-ge-wasj/GovernmentOfTheStateOfQatar,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "دولة قطر"}
                {:rdf/language "en",
                 :rdf/value    "Government of the State of Qatar"}],
   :skos/definition
   "unitary semi-constitutional monarchy in Western Asia, occupying the small Qatar Peninsula on the northeastern coast of the Arabian Peninsula and bordered by Saudi Arabia to the south"})

(def GovernmentOfTheSultinateOfOman
  "unitary absolute monarchy located on the southeastern coast of the Arabian Peninsula in Western Asia, bordered by the United Arab Emirates to the northwest, Saudi Arabia to the west, and Yemen to the southwest, and sharing marine borders with Iran and Pakistan"
  {:cmns-rga/governs :lcc-3166-1/Oman,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheSultinateOfOman,
   :db/ident :cmns-ge-wasj/GovernmentOfTheSultinateOfOman,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "سلطنة عُمان"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Sultinate of Oman"}],
   :skos/definition
   "unitary absolute monarchy located on the southeastern coast of the Arabian Peninsula in Western Asia, bordered by the United Arab Emirates to the northwest, Saudi Arabia to the west, and Yemen to the southwest, and sharing marine borders with Iran and Pakistan"})

(def GovernmentOfTheSyrianArabRepublic
  "unitary dominant-party semi-presidential Ba'athist republic bordering Lebanon to the southwest, the Mediterranean Sea to the west, Turkey to the north, Iraq to the east, Jordan to the south, and Israel to the southwest"
  {:cmns-rga/governs :lcc-3166-1/SyrianArabRepublic,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheSyrianArabRepublic,
   :db/ident :cmns-ge-wasj/GovernmentOfTheSyrianArabRepublic,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "ٱلْجُمْهُورِيَّةُ ٱلْعَرَبِيَّةُ ٱلسُّورِيَّةُ"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Syrian Arab Republic"}],
   :skos/definition
   "unitary dominant-party semi-presidential Ba'athist republic bordering Lebanon to the southwest, the Mediterranean Sea to the west, Turkey to the north, Iraq to the east, Jordan to the south, and Israel to the southwest"})

(def GovernmentOfTheUnitedArabEmirates
  "federal constitutional elective monarchy located at the eastern end of the Arabian Peninsula, bordering Oman and Saudi Arabia, with maritime borders in the Persian Gulf with Qatar and Iran"
  {:cmns-rga/governs :lcc-3166-1/UnitedArabEmirates,
   :cmns-rga/hasJurisdiction :cmns-ge-wasj/JurisdictionOfTheUnitedArabEmirates,
   :db/ident :cmns-ge-wasj/GovernmentOfTheUnitedArabEmirates,
   :rdf/type [:cmns-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "الإمارات العربية المتحدة"}
                {:rdf/language "en",
                 :rdf/value    "Government of the United Arab Emirates"}],
   :skos/definition
   "federal constitutional elective monarchy located at the eastern end of the Arabian Peninsula, bordering Oman and Saudi Arabia, with maritime borders in the Persian Gulf with Qatar and Iran"})

(def IraqiEntity
  "federated sovereignty and polity that is Iraq"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Iraq,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheRepublicOfIraq,
   :db/ident        :cmns-ge-wasj/IraqiEntity,
   :rdf/type        [:cmns-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/label      "Iraqi entity",
   :skos/definition "federated sovereignty and polity that is Iraq"})

(def IsraeliEntity
  "sovereign state and polity that is Israel"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Israel,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheStateOfIsrael,
   :db/ident        :cmns-ge-wasj/IsraeliEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "State of Israel",
   :skos/definition "sovereign state and polity that is Israel"})

(def JordanianEntity
  "sovereign state and polity that is Jordan"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Jordan,
   :cmns-ge/isRepresentedBy
   :cmns-ge-wasj/GovernmentOfTheHashemiteKingdomOfJordan,
   :db/ident        :cmns-ge-wasj/JordanianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Jordanian entity",
   :skos/definition "sovereign state and polity that is Jordan"})

(def JurisdictionOfGeorgia
  "jurisdiction of the judiciary of Georgia, which is the system of courts that interprets and applies the law in Georgia"
  {:cmns-rga/hasReach :lcc-3166-1/Georgia,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfGeorgia,
   :db/ident :cmns-ge-wasj/JurisdictionOfGeorgia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of Georgia",
   :skos/definition
   "jurisdiction of the judiciary of Georgia, which is the system of courts that interprets and applies the law in Georgia"})

(def JurisdictionOfTheHashemiteKingdomOfJordan
  "jurisdiction of the judiciary of Jordan, which is the system of courts that interprets and applies the law in Jordan"
  {:cmns-rga/hasReach :lcc-3166-1/Jordan,
   :cmns-rga/isJurisdictionOf
   :cmns-ge-wasj/GovernmentOfTheHashemiteKingdomOfJordan,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheHashemiteKingdomOfJordan,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Hashemite Kingdom of Jordan",
   :skos/definition
   "jurisdiction of the judiciary of Jordan, which is the system of courts that interprets and applies the law in Jordan"})

(def JurisdictionOfTheKingdomOfBahrain
  "jurisdiction of the judiciary of Bahrain, which is the system of courts that interprets and applies the law in Bahrain"
  {:cmns-rga/hasReach :lcc-3166-1/Bahrain,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheKingdomOfBahrain,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheKingdomOfBahrain,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Kingdom of Bahrain",
   :skos/definition
   "jurisdiction of the judiciary of Bahrain, which is the system of courts that interprets and applies the law in Bahrain"})

(def JurisdictionOfTheKingdomOfSaudiArabia
  "jurisdiction of the judiciary of Saudi Arabia, which is the system of courts that interprets and applies the law in Saudi Arabia"
  {:cmns-rga/hasReach :lcc-3166-1/SaudiArabia,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheKingdomOfSaudiArabia,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheKingdomOfSaudiArabia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Kingdom of Saudi Arabia",
   :skos/definition
   "jurisdiction of the judiciary of Saudi Arabia, which is the system of courts that interprets and applies the law in Saudi Arabia"})

(def JurisdictionOfTheLebaneseRepublic
  "jurisdiction of the judiciary of Lebanon, which is the system of courts that interprets and applies the law in Lebanon"
  {:cmns-rga/hasReach :lcc-3166-1/Lebanon,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheLebaneseRepublic,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheLebaneseRepublic,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Lebanese Republic",
   :skos/definition
   "jurisdiction of the judiciary of Lebanon, which is the system of courts that interprets and applies the law in Lebanon"})

(def JurisdictionOfTheRepublicOfArmenia
  "jurisdiction of the judiciary of Armenia, which is the system of courts that interprets and applies the law in Armenia"
  {:cmns-rga/hasReach :lcc-3166-1/Armenia,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheRepublicOfArmenia,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheRepublicOfArmenia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Republic of Armenia",
   :skos/definition
   "jurisdiction of the judiciary of Armenia, which is the system of courts that interprets and applies the law in Armenia"})

(def JurisdictionOfTheRepublicOfAzerbaijan
  "jurisdiction of the judiciary of Azerbaijan, which is the system of courts that interprets and applies the law in Azerbaijan"
  {:cmns-rga/hasReach :lcc-3166-1/Azerbaijan,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheRepublicOfAzerbaijan,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheRepublicOfAzerbaijan,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Republic of Azerbaijan",
   :skos/definition
   "jurisdiction of the judiciary of Azerbaijan, which is the system of courts that interprets and applies the law in Azerbaijan"})

(def JurisdictionOfTheRepublicOfCyprus
  "jurisdiction of the judiciary of Cyprus, which is the system of courts that interprets and applies the law in Cyprus"
  {:cmns-rga/hasReach :lcc-3166-1/Cyprus,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheRepublicOfCyprus,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheRepublicOfCyprus,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Republic of Cyprus",
   :skos/definition
   "jurisdiction of the judiciary of Cyprus, which is the system of courts that interprets and applies the law in Cyprus"})

(def JurisdictionOfTheRepublicOfIraq
  "jurisdiction of the judiciary of Iraq, which is the system of courts that interprets and applies the law in Iraq"
  {:cmns-rga/hasReach :lcc-3166-1/Iraq,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheRepublicOfIraq,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheRepublicOfIraq,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Republic of Iraq",
   :skos/definition
   "jurisdiction of the judiciary of Iraq, which is the system of courts that interprets and applies the law in Iraq"})

(def JurisdictionOfTheRepublicOfTurkey
  "jurisdiction of the judiciary of Turkey, which is the system of courts, including the Constitutional Court, Council of State, High Court of Appeals, and lower courts, that interprets and applies the law in Turkey"
  {:cmns-rga/hasReach :lcc-3166-1/Turkey,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheRepublicOfTurkey,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheRepublicOfTurkey,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Republic of Turkey",
   :skos/definition
   "jurisdiction of the judiciary of Turkey, which is the system of courts, including the Constitutional Court, Council of State, High Court of Appeals, and lower courts, that interprets and applies the law in Turkey"})

(def JurisdictionOfTheRepublicOfYemen
  "jurisdiction of the judiciary of Yemen, which is the system of courts that interprets and applies the law in Yemen"
  {:cmns-rga/hasReach :lcc-3166-1/Yemen,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheRepublicOfYemen,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheRepublicOfYemen,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Republic of Yemen",
   :skos/definition
   "jurisdiction of the judiciary of Yemen, which is the system of courts that interprets and applies the law in Yemen"})

(def JurisdictionOfTheStateOfIsrael
  "jurisdiction of the judiciary of Israel, which is the three-tiered system of courts, including the Supreme Court of Israel, that interprets and applies the law in Israel"
  {:cmns-rga/hasReach :lcc-3166-1/Israel,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheStateOfIsrael,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheStateOfIsrael,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the State of Israel",
   :skos/definition
   "jurisdiction of the judiciary of Israel, which is the three-tiered system of courts, including the Supreme Court of Israel, that interprets and applies the law in Israel"})

(def JurisdictionOfTheStateOfKuwait
  "jurisdiction of the judiciary of Kuwait, which is the system of courts that interprets and applies the law in Kuwait"
  {:cmns-rga/hasReach :lcc-3166-1/Kuwait,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheStateOfKuwait,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheStateOfKuwait,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the State of Kuwait",
   :skos/definition
   "jurisdiction of the judiciary of Kuwait, which is the system of courts that interprets and applies the law in Kuwait"})

(def JurisdictionOfTheStateOfPalestine
  "jurisdiction of the judiciary of Palestine, which is the system of courts that interprets and applies the law in Palestine"
  {:cmns-rga/hasReach :lcc-3166-1/Palestine,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheStateOfPalestine,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheStateOfPalestine,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the State of Palestine",
   :skos/definition
   "jurisdiction of the judiciary of Palestine, which is the system of courts that interprets and applies the law in Palestine"})

(def JurisdictionOfTheStateOfQatar
  "jurisdiction of the judiciary of Qatar, which is the system of courts that interprets and applies the law in Qatar"
  {:cmns-rga/hasReach :lcc-3166-1/Qatar,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheStateOfQatar,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheStateOfQatar,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the State of Qatar",
   :skos/definition
   "jurisdiction of the judiciary of Qatar, which is the system of courts that interprets and applies the law in Qatar"})

(def JurisdictionOfTheSultinateOfOman
  "jurisdiction of the judiciary of Oman, which is the system of courts that interprets and applies the law in Oman"
  {:cmns-rga/hasReach :lcc-3166-1/Oman,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheSultinateOfOman,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheSultinateOfOman,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Sultinate of Oman",
   :skos/definition
   "jurisdiction of the judiciary of Oman, which is the system of courts that interprets and applies the law in Oman"})

(def JurisdictionOfTheSyrianArabRepublic
  "jurisdiction of the judiciary of Syria, which is the system of courts that interprets and applies the law in Syria"
  {:cmns-rga/hasReach :lcc-3166-1/SyrianArabRepublic,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheSyrianArabRepublic,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheSyrianArabRepublic,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Syrian Arab Republic",
   :skos/definition
   "jurisdiction of the judiciary of Syria, which is the system of courts that interprets and applies the law in Syria"})

(def JurisdictionOfTheUnitedArabEmirates
  "jurisdiction of the judiciary of United Arab Emirates, which is the system of courts, including the Federal Supreme Court of the United Arab Emirates and other lower courts, that interprets and applies the law in United Arab Emirates"
  {:cmns-rga/hasReach :lcc-3166-1/UnitedArabEmirates,
   :cmns-rga/isJurisdictionOf :cmns-ge-wasj/GovernmentOfTheUnitedArabEmirates,
   :db/ident :cmns-ge-wasj/JurisdictionOfTheUnitedArabEmirates,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the United Arab Emirates",
   :rdfs/seeAlso "http://ejustice.gov.ae/",
   :skos/definition
   "jurisdiction of the judiciary of United Arab Emirates, which is the system of courts, including the Federal Supreme Court of the United Arab Emirates and other lower courts, that interprets and applies the law in United Arab Emirates"})

(def KuwaitiEntity
  "sovereign state and polity that is Kuwait"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Kuwait,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheStateOfKuwait,
   :db/ident        :cmns-ge-wasj/KuwaitiEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Kuwaiti entity",
   :skos/definition "sovereign state and polity that is Kuwait"})

(def LebanoneseEntity
  "sovereign state and polity that is Lebanon"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Lebanon,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheLebaneseRepublic,
   :db/ident        :cmns-ge-wasj/LebanoneseEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Lebanonese entity",
   :skos/definition "sovereign state and polity that is Lebanon"})

(def OmaniEntity
  "sovereign state and polity that is Oman"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Oman,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheSultinateOfOman,
   :db/ident        :cmns-ge-wasj/OmaniEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Omani entity",
   :skos/definition "sovereign state and polity that is Oman"})

(def PalestinianEntity
  "sovereign state and polity that is Palestine"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Palestine,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheStateOfPalestine,
   :db/ident        :cmns-ge-wasj/PalestinianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Palestinian entity",
   :skos/definition "sovereign state and polity that is Palestine"})

(def QatariEntity
  "sovereign state and polity that is Qatar"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Qatar,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheStateOfQatar,
   :db/ident        :cmns-ge-wasj/QatariEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Qatari entity",
   :skos/definition "sovereign state and polity that is Qatar"})

(def SaudiArabianEntity
  "sovereign state and polity that is Saudi Arabia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/SaudiArabia,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheKingdomOfSaudiArabia,
   :db/ident        :cmns-ge-wasj/SaudiArabianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Saudi Arabian entity",
   :skos/definition "sovereign state and polity that is Saudi Arabia"})

(def SyrianEntity
  "sovereign state and polity that is Syria"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/SyrianArabRepublic,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheSyrianArabRepublic,
   :db/ident        :cmns-ge-wasj/SyrianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Syrian entity",
   :skos/definition "sovereign state and polity that is Syria"})

(def TurkishEntity
  "sovereign state and polity that is Turkey"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Turkey,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheRepublicOfTurkey,
   :db/ident        :cmns-ge-wasj/TurkishEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Turkish entity",
   :skos/definition "sovereign state and polity that is Turkey"})

(def YemeniEntity
  "sovereign state and polity that is Yemen"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Yemen,
   :cmns-ge/isRepresentedBy :cmns-ge-wasj/GovernmentOfTheRepublicOfYemen,
   :db/ident        :cmns-ge-wasj/YemeniEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Yemeni entity",
   :skos/definition "sovereign state and polity that is Yemen"})