(ns net.wikipunk.rdf.lcc-3166-2
  "This ontology defines the code set relevant to representation of subdivisions of countries, as required to support the ISO 3166-2 subdivision codes. The codes for each country are defined by country in subordinate, regional ontologies."
  {:cmns-av/copyright ["Copyright (c) 2015-2022 Thematix Partners LLC"
                       "Copyright (c) 2015-2017 Unisys"
                       "Copyright (c) 2015-2022 Object Management Group, Inc."
                       "Copyright (c) 2015-2019 Adaptive, Inc."
                       "Copyright (c) 2019-2022 agnos.ai UK Ltd."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Countries/ISO3166-2-SubdivisionCodes.rdf",
   :dcterms/abstract
   "This ontology defines the code set relevant to representation of subdivisions of countries, as required to support the ISO 3166-2 subdivision codes. The codes for each country are defined by country in subordinate, regional ontologies.",
   :dcterms/contributor ["Elisa Kendall, Thematix Partners LLC"
                         "Pete Rivett, agnos.ai U.K. Ltd"],
   :dcterms/issued #inst "2021-11-07T23:48:51.125-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/references ["http://purl.org/dc/terms/"
                        "http://www.w3.org/2004/02/skos/core#"],
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20221101/Countries/ISO3166-2-SubdivisionCodes/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-2"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
   :rdfa/prefix "lcc-3166-2",
   :rdfa/uri
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
   :rdfs/label "ISO 3166-2 Subdivision Codes Ontology",
   :rdfs/seeAlso ["https://www.omg.org/spec/LCC/AboutLCC/"
                  "https://www.omg.org/spec/LCC/Countries/AboutCountries/"]})

(def ISO3166-2-CodeSet
  "the set of subdivision identifiers that comprise the ISO 3166-2 specification"
  {:db/ident :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type
   [:cmns-id/IdentificationScheme :cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
   :rdfs/label "ISO 3166-2 code set",
   :skos/definition
   "the set of subdivision identifiers that comprise the ISO 3166-2 specification"})

(def Territory
  "a kind of region that is a territory"
  {:db/ident :lcc-3166-2/Territory,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
   :rdfs/label "territory",
   :skos/definition "a kind of region that is a territory"})