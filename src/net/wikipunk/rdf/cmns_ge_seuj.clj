(ns net.wikipunk.rdf.cmns-ge-seuj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a business perspective."
  {:cmns-av/copyright ["Copyright (c) 2010-2022 Object Management Group, Inc."
                       "Copyright (c) 2010-2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a business perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/GovernmentEntities/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-ge" "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-ge-seuj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
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
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "cmns-ge-seuj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Commons Southern Europe Government Entities and Jurisdictions Ontology",
   :skos/note
   "This ontology is derived from the Financial Industry Business Ontology (FIBO) Southern Europe Government Entities and Jurisdictions ontology.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def AlbanianEntity
  "sovereign state and polity that is Albania"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Albania,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheRepublicOfAlbania,
   :db/ident        :cmns-ge-seuj/AlbanianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "sq",
                      :rdf/value    "Entiteti shqiptar"}
                     {:rdf/language "en",
                      :rdf/value    "Albanian entity"}],
   :skos/definition "sovereign state and polity that is Albania"})

(def AndorranEntity
  "sovereign state and polity that is Andorra"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Andorra,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfThePrincipalityOfAndorra,
   :db/ident        :cmns-ge-seuj/AndorranEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "ca",
                      :rdf/value    "Entitat andorrana"}
                     {:rdf/language "en",
                      :rdf/value    "Andorran entity"}],
   :skos/definition "sovereign state and polity that is Andorra"})

(def BosnianAndHerzegovinianEntity
  "federal sovereignty state and polity that is Bosnia and Herzegovina"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/BosniaAndHerzegovina,
   :cmns-ge/isRepresentedBy
   :cmns-ge-seuj/GovernmentOfTheFederationOfBosniaAndHerzegovina,
   :db/ident :cmns-ge-seuj/BosnianAndHerzegovinianEntity,
   :rdf/type [:cmns-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sr",
                 :rdf/value    "Босанскохерцеговачки ентитет"}
                {:rdf/language "en",
                 :rdf/value    "Bosnian and Herzegovinian entity"}
                {:rdf/language "hr",
                 :rdf/value    "Bosanskohercegovački entitet"}
                {:rdf/language "bs",
                 :rdf/value    "Bosanskohercegovački entitet"}],
   :skos/definition
   "federal sovereignty state and polity that is Bosnia and Herzegovina"})

(def CroatianEntity
  "sovereign state and polity that is Croatia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Croatia,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheRepublicOfCroatia,
   :db/ident        :cmns-ge-seuj/CroatianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "hr",
                      :rdf/value    "Hrvatski entitet"}
                     {:rdf/language "en",
                      :rdf/value    "Croatian entity"}],
   :skos/definition "sovereign state and polity that is Croatia"})

(def GovernmentOfMontenegro
  "unitary, dominant-party, parliamentary constitutional republic that is located in South and Southeast Europe on the coast of the Balkans"
  {:cmns-rga/governs :lcc-3166-1/Montenegro,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfMontenegro,
   :db/ident :cmns-ge-seuj/GovernmentOfMontenegro,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Montenegro"},
   :rdfs/seeAlso "http://www.gov.me/en/homepage/",
   :skos/definition
   "unitary, dominant-party, parliamentary constitutional republic that is located in South and Southeast Europe on the coast of the Balkans"})

(def GovernmentOfTheFederationOfBosniaAndHerzegovina
  "federal parliamentary constitutional republic that is a representative democracy, located in South and Southeast Europe, within the Balkans"
  {:cmns-rga/governs :lcc-3166-1/BosniaAndHerzegovina,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfBosniaAndHerzegovina,
   :db/ident :cmns-ge-seuj/GovernmentOfTheFederationOfBosniaAndHerzegovina,
   :rdf/type [:owl/NamedIndividual :cmns-ge/FederalGovernment],
   :rdfs/label [{:rdf/language "hr",
                 :rdf/value    "Vlada Federacije Bosne i Hercegovine"}
                {:rdf/language "bs",
                 :rdf/value    "Vlada Federacije Bosne i Hercegovine"}
                {:rdf/language "en",
                 :rdf/value
                 "Government of the Federation of Bosnia and Herzegovina"}
                {:rdf/language "sr",
                 :rdf/value    "Влада Федерације Босне и Херцеговине"}],
   :rdfs/seeAlso "http://fbihvlada.gov.ba/english/",
   :skos/definition
   "federal parliamentary constitutional republic that is a representative democracy, located in South and Southeast Europe, within the Balkans"})

(def GovernmentOfTheHellenicRepublic
  "unitary parliamentary republic, located on the Balkan Peninsula in Southeast Europe"
  {:cmns-rga/governs :lcc-3166-1/Greece,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfGreece,
   :db/ident :cmns-ge-seuj/GovernmentOfTheHellenicRepublic,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "el",
                 :rdf/value    "Κυβέρνηση της Ελληνικής Δημοκρατίας"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Hellenic Republic"}],
   :rdfs/seeAlso
   "https://www.mfa.gr/missionsabroad/en/about-greece/government-and-politics/",
   :skos/definition
   "unitary parliamentary republic, located on the Balkan Peninsula in Southeast Europe"})

(def GovernmentOfTheHolySee
  "unitary Christian absolute monarchy (under an ecclesiastical and elective theocracy), headquartered in, operates from, and exercises 'exclusive dominion' over the independent Vatican City State enclave in Rome, of which the pope is sovereign, administered by the Roman Curia"
  {:cmns-av/synonym "Government of the See of Rome",
   :cmns-rga/governs :lcc-3166-1/HolySee,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfTheHolySee,
   :db/ident :cmns-ge-seuj/GovernmentOfTheHolySee,
   :rdf/type [:owl/NamedIndividual :cmns-ge/NationalGovernment],
   :rdfs/label [{:rdf/language "la",
                 :rdf/value    "Imperium in Consiliis Sanctae Sedis"}
                {:rdf/language "it",
                 :rdf/value    "Governo della Santa Sede"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Holy See"}],
   :rdfs/seeAlso "http://www.vatican.va/content/vatican/en.html",
   :skos/definition
   "unitary Christian absolute monarchy (under an ecclesiastical and elective theocracy), headquartered in, operates from, and exercises 'exclusive dominion' over the independent Vatican City State enclave in Rome, of which the pope is sovereign, administered by the Roman Curia"})

(def GovernmentOfTheKingdomOfSpain
  "unitary parliamentary constitutional monarchy, whose monarch is the head of state and prime minister is the head of government, located in Southwestern Europe with some pockets of territory across the Strait of Gibraltar and the Atlantic Ocean"
  {:cmns-rga/governs :lcc-3166-1/Spain,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfSpain,
   :db/ident :cmns-ge-seuj/GovernmentOfTheKingdomOfSpain,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of the Kingdom of Spain"}
                {:rdf/language "es",
                 :rdf/value    "Gobierno del Reino de España"}],
   :rdfs/seeAlso "https://www.lamoncloa.gob.es/lang/en/Paginas/index.aspx",
   :skos/definition
   "unitary parliamentary constitutional monarchy, whose monarch is the head of state and prime minister is the head of government, located in Southwestern Europe with some pockets of territory across the Strait of Gibraltar and the Atlantic Ocean"})

(def GovernmentOfThePortugueseRepublic
  "unitary, semi-presidential, constitutional, representative democratic republic, located mostly on the Iberian Peninsula, in southwestern Europe"
  {:cmns-rga/governs :lcc-3166-1/Portugal,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfPortugal,
   :db/ident :cmns-ge-seuj/GovernmentOfThePortugueseRepublic,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "Governo da República Portuguesa"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Portuguese Republic"}],
   :rdfs/seeAlso "https://www.portugal.gov.pt/en/gc21",
   :skos/definition
   "unitary, semi-presidential, constitutional, representative democratic republic, located mostly on the Iberian Peninsula, in southwestern Europe"})

(def GovernmentOfThePrincipalityOfAndorra
  "unitary parliamentary semi-elective diarchy, a sovereign landlocked microstate on the Iberian Peninsula, in the eastern Pyrenees, bordered by France to the north and Spain to the south"
  {:cmns-rga/governs :lcc-3166-1/Andorra,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfAndorra,
   :db/ident :cmns-ge-seuj/GovernmentOfThePrincipalityOfAndorra,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of the Principality of Andorra"}
                {:rdf/language "ca",
                 :rdf/value    "Govern del Principat d’Andorra"}],
   :rdfs/seeAlso "https://www.govern.ad/",
   :skos/definition
   "unitary parliamentary semi-elective diarchy, a sovereign landlocked microstate on the Iberian Peninsula, in the eastern Pyrenees, bordered by France to the north and Spain to the south"})

(def GovernmentOfTheRepublicOfAlbania
  "unitary parliamentary constitutional republic, located in Southeast Europe on the Adriatic and Ionian Sea within the Mediterranean Sea"
  {:cmns-rga/governs :lcc-3166-1/Albania,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfAlbania,
   :db/ident :cmns-ge-seuj/GovernmentOfTheRepublicOfAlbania,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sq",
                 :rdf/value    "Qeveria e Republikës së Shqipërisë"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Albania"}],
   :rdfs/seeAlso "http://parlament.al/",
   :skos/definition
   "unitary parliamentary constitutional republic, located in Southeast Europe on the Adriatic and Ionian Sea within the Mediterranean Sea"})

(def GovernmentOfTheRepublicOfCroatia
  "unitary parliamentary constitutional republic, located in Southeast Europe, bordering Slovenia to the northwest, Hungary to the northeast, Serbia to the east, Bosnia and Herzegovina, and Montenegro to the southeast, sharing a maritime border with Italy"
  {:cmns-rga/governs :lcc-3166-1/Croatia,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfCroatia,
   :db/ident :cmns-ge-seuj/GovernmentOfTheRepublicOfCroatia,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "hr",
                 :rdf/value    "Vlada Republike Hrvatske"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Croatia"}],
   :rdfs/seeAlso "https://vlada.gov.hr/",
   :skos/definition
   "unitary parliamentary constitutional republic, located in Southeast Europe, bordering Slovenia to the northwest, Hungary to the northeast, Serbia to the east, Bosnia and Herzegovina, and Montenegro to the southeast, sharing a maritime border with Italy"})

(def GovernmentOfTheRepublicOfItaly
  "unitary parliamentary, constitutional, democratic republic, consisting of a peninsula bordering the Alps and surrounded by several islands, located in south-central Europe"
  {:cmns-rga/governs :lcc-3166-1/Italy,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfItaly,
   :db/ident :cmns-ge-seuj/GovernmentOfTheRepublicOfItaly,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Governo della Repubblica Italiana"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Italy"}],
   :rdfs/seeAlso "http://www.governo.it/",
   :skos/definition
   "unitary parliamentary, constitutional, democratic republic, consisting of a peninsula bordering the Alps and surrounded by several islands, located in south-central Europe"})

(def GovernmentOfTheRepublicOfMalta
  "unitary parliamentary constitutional republic modelled on the Westminster system that is a Southern European island country consisting of an archipelago in the Mediterranean Sea"
  {:cmns-rga/governs :lcc-3166-1/Malta,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfMalta,
   :db/ident :cmns-ge-seuj/GovernmentOfTheRepublicOfMalta,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Republic of Malta"},
   :rdfs/seeAlso "https://www.gov.mt/",
   :skos/definition
   "unitary parliamentary constitutional republic modelled on the Westminster system that is a Southern European island country consisting of an archipelago in the Mediterranean Sea"})

(def GovernmentOfTheRepublicOfNorthMacedonia
  "unitary parliamentary, constitutional, democratic republic, located in the Balkan Peninsula in Southeast Europe"
  {:cmns-rga/governs :lcc-3166-1/NorthMacedonia,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfNorthMacedonia,
   :db/ident :cmns-ge-seuj/GovernmentOfTheRepublicOfNorthMacedonia,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "mk",
                 :rdf/value    "Влада на Република Северна Македонија"}
                {:rdf/language "en",
                 :rdf/value "Government of the Republic of North Macedonia"}],
   :rdfs/seeAlso "https://vlada.mk/",
   :skos/definition
   "unitary parliamentary, constitutional, democratic republic, located in the Balkan Peninsula in Southeast Europe"})

(def GovernmentOfTheRepublicOfSanMarino
  "unitary parliamentary, diarchic, directorial republic that is a microstate in Southern Europe, completely surrounded by Italy, located on the northeastern side of the Apennine Mountains"
  {:cmns-rga/governs :lcc-3166-1/SanMarino,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfSanMarino,
   :db/ident :cmns-ge-seuj/GovernmentOfTheRepublicOfSanMarino,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Governo della Repubblica di San Marino"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of San Marino"}],
   :rdfs/seeAlso "http://www.sanmarino.sm/on-line/en/home.html",
   :skos/definition
   "unitary parliamentary, diarchic, directorial republic that is a microstate in Southern Europe, completely surrounded by Italy, located on the northeastern side of the Apennine Mountains"})

(def GovernmentOfTheRepublicOfSerbia
  "unitary, dominant-party, parliamentary constitutional republic that is situated at the crossroads of Central and Southeast Europe in the southern Pannonian Plain and the central Balkans"
  {:cmns-rga/governs :lcc-3166-1/Serbia,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfSerbia,
   :db/ident :cmns-ge-seuj/GovernmentOfTheRepublicOfSerbia,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sr",
                 :rdf/value    "Влада Републике Србије"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Serbia"}],
   :rdfs/seeAlso "https://www.srbija.gov.rs/",
   :skos/definition
   "unitary, dominant-party, parliamentary constitutional republic that is situated at the crossroads of Central and Southeast Europe in the southern Pannonian Plain and the central Balkans"})

(def GovernmentOfTheRepublicOfSlovenia
  "unitary, parliamentary constitutional republic bordered by Italy to the west, Austria to the north, Hungary to the northeast, Croatia to the southeast, and the Adriatic Sea to the southwest"
  {:cmns-rga/governs :lcc-3166-1/Slovenia,
   :cmns-rga/hasJurisdiction :cmns-ge-seuj/JurisdictionOfSlovenia,
   :db/ident :cmns-ge-seuj/GovernmentOfTheRepublicOfSlovenia,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sl",
                 :rdf/value    "Vlada Republike Slovenije"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Slovenia"}],
   :rdfs/seeAlso "https://www.gov.si/",
   :skos/definition
   "unitary, parliamentary constitutional republic bordered by Italy to the west, Austria to the north, Hungary to the northeast, Croatia to the southeast, and the Adriatic Sea to the southwest"})

(def GreekEntity
  "sovereign state and polity that is Greece"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Greece,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheHellenicRepublic,
   :db/ident        :cmns-ge-seuj/GreekEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "el",
                      :rdf/value    "Ελληνική οντότητα"}
                     {:rdf/language "en",
                      :rdf/value    "Greek entity"}],
   :skos/definition "sovereign state and polity that is Greece"})

(def HolySeeEntity
  "sovereign state and polity that is the Holy See"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/HolySee,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheHolySee,
   :db/ident        :cmns-ge-seuj/HolySeeEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Holy See entity"}
                     {:rdf/language "it",
                      :rdf/value    "Entità della Santa Sede"}],
   :skos/definition "sovereign state and polity that is the Holy See"})

(def ItalianEntity
  "sovereign state and polity that is Italy"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Italy,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheRepublicOfItaly,
   :db/ident        :cmns-ge-seuj/ItalianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Italian entity"}
                     {:rdf/language "it",
                      :rdf/value    "Ente italiano"}],
   :skos/definition "sovereign state and polity that is Italy"})

(def JurisdictionOfAlbania
  "jurisdiction of the judiciary of Albania, a system of courts that includes the supreme court, constitutional court, appeal court and administrative court, and whose Supreme Court of the Republic of Albania is the highest court and is the final court of appeal"
  {:cmns-rga/hasReach :lcc-3166-1/Albania,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheRepublicOfAlbania,
   :db/ident :cmns-ge-seuj/JurisdictionOfAlbania,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Albania"}
                {:rdf/language "sq",
                 :rdf/value    "juridiksioni i Shqipërisë"}],
   :rdfs/seeAlso "https://en.wikipedia.org/wiki/Supreme_Court_of_Albania",
   :skos/definition
   "jurisdiction of the judiciary of Albania, a system of courts that includes the supreme court, constitutional court, appeal court and administrative court, and whose Supreme Court of the Republic of Albania is the highest court and is the final court of appeal"})

(def JurisdictionOfAndorra
  "jurisdiction of the judiciary of Andorra, composed of the Magistrates Court, the Criminal Law Court, the High Court of Andorra, and the Constitutional Court"
  {:cmns-rga/hasReach :lcc-3166-1/Andorra,
   :cmns-rga/isJurisdictionOf
   :cmns-ge-seuj/GovernmentOfThePrincipalityOfAndorra,
   :db/ident :cmns-ge-seuj/JurisdictionOfAndorra,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Andorra"}
                {:rdf/language "ca",
                 :rdf/value    "jurisdicció d’Andorra"}],
   :skos/definition
   "jurisdiction of the judiciary of Andorra, composed of the Magistrates Court, the Criminal Law Court, the High Court of Andorra, and the Constitutional Court"})

(def JurisdictionOfBosniaAndHerzegovina
  "jurisdiction of the judiciary of Bosnia and Herzegovina, whose Constitutional Court of Bosnia and Herzegovina is the supreme, final arbiter of legal matters"
  {:cmns-rga/hasReach :lcc-3166-1/BosniaAndHerzegovina,
   :cmns-rga/isJurisdictionOf
   :cmns-ge-seuj/GovernmentOfTheFederationOfBosniaAndHerzegovina,
   :db/ident :cmns-ge-seuj/JurisdictionOfBosniaAndHerzegovina,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "hr",
                 :rdf/value    "nadležnost Bosne i Hercegovine"}
                {:rdf/language "bs",
                 :rdf/value    "nadležnost Bosne i Hercegovine"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Bosnia and Herzegovina"}
                {:rdf/language "sr",
                 :rdf/value    "надлежност Босне и Херцеговине"}],
   :rdfs/seeAlso
   "http://www.mpr.gov.ba/organizacija_nadleznosti/pravosudje/Default.aspx",
   :skos/definition
   "jurisdiction of the judiciary of Bosnia and Herzegovina, whose Constitutional Court of Bosnia and Herzegovina is the supreme, final arbiter of legal matters"})

(def JurisdictionOfCroatia
  "jurisdiction of the judiciary of Croatia, a civil law legal system in which law arises primarily from written statutes, influenced by German and Austrian legal systems, whose national courts include the Constitutional Court, which oversees violations of the Constitution, and the Supreme Court, which is the highest court of appeal"
  {:cmns-rga/hasReach :lcc-3166-1/Croatia,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheRepublicOfCroatia,
   :db/ident :cmns-ge-seuj/JurisdictionOfCroatia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "hr",
                 :rdf/value    "nadležnost Hrvatske"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Croatia"}],
   :rdfs/seeAlso "https://www.usud.hr/",
   :skos/definition
   "jurisdiction of the judiciary of Croatia, a civil law legal system in which law arises primarily from written statutes, influenced by German and Austrian legal systems, whose national courts include the Constitutional Court, which oversees violations of the Constitution, and the Supreme Court, which is the highest court of appeal"})

(def JurisdictionOfGreece
  "jurisdiction of the judiciary of the Hellenic Republic, whose supreme courts include the Court of Cassation, the Council of State and the Court of Auditors"
  {:cmns-rga/hasReach :lcc-3166-1/Greece,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheHellenicRepublic,
   :db/ident :cmns-ge-seuj/JurisdictionOfGreece,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "el",
                 :rdf/value    "δικαιοδοσία της Ελλάδας"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Greece"}],
   :rdfs/seeAlso
   "https://www.mfa.gr/missionsabroad/en/about-greece/government-and-politics/judicial-power.html",
   :skos/definition
   "jurisdiction of the judiciary of the Hellenic Republic, whose supreme courts include the Court of Cassation, the Council of State and the Court of Auditors"})

(def JurisdictionOfItaly
  "jurisdiction of the judiciary of Italy, a system of courts that is based on Roman law modified by the Napoleonic code and later statutes, comprising the Supreme Court of Cassation, the highest court in Italy for both criminal and civil appeal cases, and the Constitutional Court of Italy (Corte Costituzionale)"
  {:cmns-rga/hasReach :lcc-3166-1/Italy,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheRepublicOfItaly,
   :db/ident :cmns-ge-seuj/JurisdictionOfItaly,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Italy"}
                {:rdf/language "it",
                 :rdf/value    "giurisdizione dell'Italia"}],
   :skos/definition
   "jurisdiction of the judiciary of Italy, a system of courts that is based on Roman law modified by the Napoleonic code and later statutes, comprising the Supreme Court of Cassation, the highest court in Italy for both criminal and civil appeal cases, and the Constitutional Court of Italy (Corte Costituzionale)"})

(def JurisdictionOfMalta
  "jurisdiction of the judiciary of Malta, which is based partially on English law and partly on Continental law, that interprets and applies the laws of Malta to ensure equal justice under law, and to provide a mechanism for dispute resolution"
  {:cmns-rga/hasReach :lcc-3166-1/Malta,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheRepublicOfMalta,
   :db/ident :cmns-ge-seuj/JurisdictionOfMalta,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jurisdiction of Malta"},
   :rdfs/seeAlso
   "https://justice.gov.mt/en/justice/Pages/The-Judiciary-in-Malta.aspx",
   :skos/definition
   "jurisdiction of the judiciary of Malta, which is based partially on English law and partly on Continental law, that interprets and applies the laws of Malta to ensure equal justice under law, and to provide a mechanism for dispute resolution"})

(def JurisdictionOfMontenegro
  "jurisdiction of the judiciary of Montenegro, that interprets and applies the laws of Montenegro, and has been working with the European Union over the last several years to increase judicial independence and accountability"
  {:cmns-rga/hasReach :lcc-3166-1/Montenegro,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfMontenegro,
   :db/ident :cmns-ge-seuj/JurisdictionOfMontenegro,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jurisdiction of Montenegro"},
   :skos/definition
   "jurisdiction of the judiciary of Montenegro, that interprets and applies the laws of Montenegro, and has been working with the European Union over the last several years to increase judicial independence and accountability"})

(def JurisdictionOfNorthMacedonia
  "jurisdiction of the judiciary of North Macedonia, an independent judicial branch that includes a constitutional court"
  {:cmns-rga/hasReach :lcc-3166-1/NorthMacedonia,
   :cmns-rga/isJurisdictionOf
   :cmns-ge-seuj/GovernmentOfTheRepublicOfNorthMacedonia,
   :db/ident :cmns-ge-seuj/JurisdictionOfNorthMacedonia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "mk",
                 :rdf/value    "јурисдикција на Северна Македонија"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of North Macedonia"}],
   :rdfs/seeAlso
   "https://www.sobranie.mk/the-constitution-of-the-republic-of-macedonia-ns_article-constitution-of-the-republic-of-north-macedonia.nspx",
   :skos/definition
   "jurisdiction of the judiciary of North Macedonia, an independent judicial branch that includes a constitutional court"})

(def JurisdictionOfPortugal
  "jurisdiction of the judiciary of Portugal, a system of courts that together constitute one of the four organs of Sovereignty as defined by the Portuguese Constitution"
  {:cmns-rga/hasReach :lcc-3166-1/Portugal,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfThePortugueseRepublic,
   :db/ident :cmns-ge-seuj/JurisdictionOfPortugal,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "jurisdição de portugal"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Portugal"}],
   :rdfs/seeAlso "https://en.wikipedia.org/wiki/Judiciary_of_Portugal",
   :skos/definition
   "jurisdiction of the judiciary of Portugal, a system of courts that together constitute one of the four organs of Sovereignty as defined by the Portuguese Constitution"})

(def JurisdictionOfSanMarino
  "jurisdiction of the judiciary of San Marino, including the Council of Twelve, which forms the judicial branch during the period of legislature of the Council"
  {:cmns-rga/hasReach :lcc-3166-1/SanMarino,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheRepublicOfSanMarino,
   :db/ident :cmns-ge-seuj/JurisdictionOfSanMarino,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of San Marino"}
                {:rdf/language "it",
                 :rdf/value    "giurisdizione di San Marino"}],
   :skos/definition
   "jurisdiction of the judiciary of San Marino, including the Council of Twelve, which forms the judicial branch during the period of legislature of the Council"})

(def JurisdictionOfSerbia
  "jurisdiction of the judiciary of Serbia, a three-tiered judicial system that includes the Supreme Court of Cassation as the court of the last resort, Courts of Appeal as the appellate instance, and Basic and High courts as the general jurisdictions at first instance"
  {:cmns-rga/hasReach :lcc-3166-1/Serbia,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheRepublicOfSerbia,
   :db/ident :cmns-ge-seuj/JurisdictionOfSerbia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sr",
                 :rdf/value    "надлежност Србије"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Serbia"}],
   :skos/definition
   "jurisdiction of the judiciary of Serbia, a three-tiered judicial system that includes the Supreme Court of Cassation as the court of the last resort, Courts of Appeal as the appellate instance, and Basic and High courts as the general jurisdictions at first instance"})

(def JurisdictionOfSlovenia
  "jurisdiction of the judiciary of Slovenia, a system of courts with general responsibilities and specialised courts that deal with matters relating to specific legal areas, including a Constitutional Court at the highest level"
  {:cmns-rga/hasReach :lcc-3166-1/Slovenia,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheRepublicOfSlovenia,
   :db/ident :cmns-ge-seuj/JurisdictionOfSlovenia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sl",
                 :rdf/value    "pristojnost Slovenije"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Slovenia"}],
   :rdfs/seeAlso "http://www.sodisce.si/",
   :skos/definition
   "jurisdiction of the judiciary of Slovenia, a system of courts with general responsibilities and specialised courts that deal with matters relating to specific legal areas, including a Constitutional Court at the highest level"})

(def JurisdictionOfSpain
  "jurisdiction of judiciary of Spain, a system of courts that includes senior judges - the President and judges of the Constitutional Court (the highest tribunal in the Kingdom) - that interprets and applies the law in Spain"
  {:cmns-rga/hasReach :lcc-3166-1/Spain,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheKingdomOfSpain,
   :db/ident :cmns-ge-seuj/JurisdictionOfSpain,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Spain"}
                {:rdf/language "es",
                 :rdf/value    "jurisdicción de España"}],
   :rdfs/seeAlso "http://www.poderjudicial.es/cgpj/es/Poder_Judicial",
   :skos/definition
   "jurisdiction of judiciary of Spain, a system of courts that includes senior judges - the President and judges of the Constitutional Court (the highest tribunal in the Kingdom) - that interprets and applies the law in Spain"})

(def JurisdictionOfTheHolySee
  "jurisdiction of the Bishop of Rome, known as the pope, which includes the apostolic episcopal see of the Diocese of Rome with universal ecclesiastical jurisdiction of the worldwide Catholic Church, as well as a sovereign entity of international law, governing the Vatican City"
  {:cmns-rga/hasReach :lcc-3166-1/HolySee,
   :cmns-rga/isJurisdictionOf :cmns-ge-seuj/GovernmentOfTheHolySee,
   :db/ident :cmns-ge-seuj/JurisdictionOfTheHolySee,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of the Holy See"}
                {:rdf/language "la",
                 :rdf/value    "ius proprium Sanctae Sedis"}
                {:rdf/language "it",
                 :rdf/value    "giurisdizione della Santa Sede"}],
   :skos/definition
   "jurisdiction of the Bishop of Rome, known as the pope, which includes the apostolic episcopal see of the Diocese of Rome with universal ecclesiastical jurisdiction of the worldwide Catholic Church, as well as a sovereign entity of international law, governing the Vatican City"})

(def MalteseEntity
  "sovereign state and polity that is Malta"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Malta,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheRepublicOfMalta,
   :db/ident        :cmns-ge-seuj/MalteseEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Maltese entity"},
   :skos/definition "sovereign state and polity that is Malta"})

(def MontenegrinEntity
  "sovereign state and polity that is Montenegro"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Montenegro,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfMontenegro,
   :db/ident        :cmns-ge-seuj/MontenegrinEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Montenegrin entity"},
   :skos/definition "sovereign state and polity that is Montenegro"})

(def NorthMacedonianEntity
  "sovereign state and polity that is North Macedonia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/NorthMacedonia,
   :cmns-ge/isRepresentedBy
   :cmns-ge-seuj/GovernmentOfTheRepublicOfNorthMacedonia,
   :db/ident        :cmns-ge-seuj/NorthMacedonianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "mk",
                      :rdf/value    "Северномакедонски субјект"}
                     {:rdf/language "en",
                      :rdf/value    "North Macedonian entity"}],
   :skos/definition "sovereign state and polity that is North Macedonia"})

(def PortugueseEntity
  "sovereign state and polity that is Portugal"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Portugal,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfThePortugueseRepublic,
   :db/ident        :cmns-ge-seuj/PortugueseEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Portuguese entity"}
                     {:rdf/language "pt",
                      :rdf/value    "Entidade portuguesa"}],
   :skos/definition "sovereign state and polity that is Portugal"})

(def SammarineseEntity
  "sovereign state and polity that is San Marino"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/SanMarino,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheRepublicOfSanMarino,
   :db/ident        :cmns-ge-seuj/SammarineseEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Sammarinese entity"}
                     {:rdf/language "it",
                      :rdf/value    "Ente sammarinese"}],
   :skos/definition "sovereign state and polity that is San Marino"})

(def SerbianEntity
  "sovereign state and polity that is Serbia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Serbia,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheRepublicOfSerbia,
   :db/ident        :cmns-ge-seuj/SerbianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "sr",
                      :rdf/value    "Српски ентитет"}
                     {:rdf/language "en",
                      :rdf/value    "Serbian entity"}],
   :skos/definition "sovereign state and polity that is Serbia"})

(def SloveneEntity
  "sovereign state and polity that is Slovenia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Slovenia,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheRepublicOfSlovenia,
   :db/ident        :cmns-ge-seuj/SloveneEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "sl",
                      :rdf/value    "Slovenska entiteta"}
                     {:rdf/language "en",
                      :rdf/value    "Slovene entity"}],
   :skos/definition "sovereign state and polity that is Slovenia"})

(def SpanishEntity
  "sovereign state and polity that is Spain"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Spain,
   :cmns-ge/isRepresentedBy :cmns-ge-seuj/GovernmentOfTheKingdomOfSpain,
   :db/ident        :cmns-ge-seuj/SpanishEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Spanish entity"}
                     {:rdf/language "es",
                      :rdf/value    "Entidad española"}],
   :skos/definition "sovereign state and polity that is Spain"})