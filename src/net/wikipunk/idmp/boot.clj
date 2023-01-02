(ns net.wikipunk.idmp.boot
  {:rdf/type :jsonld/Context})

(def spec
  {:dcat/downloadURL "https://raw.githubusercontent.com/edmcouncil/idmp/master/MetadataIDMP.rdf"
   :rdfa/prefix      "idmp-spec"
   :rdfa/uri         "https://spec.pistoiaalliance.org/idmp/ontology/MetadataIDMP/"
   :rdf/type         :rdfa/PrefixMapping})

(def cmns-mod
  {:dcat/downloadURL "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/MetadataCMNS.rdf"
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "cmns-mod",
   :rdfa/uri         "https://www.omg.org/spec/Commons/MetadataCMNS/"})

(def idmp-ext-mod
  {:dcat/downloadURL "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/MetadataEXT.rdf"
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "idmp-ext-mod",
   :rdfa/uri         "https://spec.pistoiaalliance.org/idmp/ontology/EXT/MetadataEXT/"})

(def idmp-iso-mod
  {:dcat/downloadURL "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/MetadataISO.rdf"
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "idmp-iso-mod",
   :rdfa/uri         "https://spec.pistoiaalliance.org/idmp/ontology/ISO/MetadataISO/"})

(def idmp-meta-mod
  {:dcat/downloadURL "https://raw.githubusercontent.com/edmcouncil/idmp/master/META/MetadataMETA.rdf"
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "idmp-meta-mod",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/META/MetadataMETA/"})

(def lcc-mod
  {:dcat/downloadURL "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/MetadataLCC.rdf"
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "lcc-mod",
   :rdfa/uri         "https://www.omg.org/spec/LCC/MetadataLCC/"})

(def cmns-av
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-av",
   :rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
   :dcat/downloadURL
     "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/AnnotationVocabulary.rdf"})

(def cmns-cds
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-cds",
   :rdfa/uri "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/CodesAndCodeSets.rdf"})

(def cmns-cls
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-cls",
   :rdfa/uri "https://www.omg.org/spec/Commons/Classifiers/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Classifiers.rdf"})

(def cmns-col
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-col",
   :rdfa/uri "https://www.omg.org/spec/Commons/Collections/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Collections.rdf"})

(def cmns-cxtdsg
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-cxtdsg",
   :rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/ContextualDesignators.rdf"})

(def cmns-cxtid
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-cxtid",
   :rdfa/uri "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/ContextualIdentifiers.rdf"})

(def cmns-doc
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-doc",
   :rdfa/uri "https://www.omg.org/spec/Commons/Documents/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Documents.rdf"})

(def cmns-dsg
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-dsg",
   :rdfa/uri "https://www.omg.org/spec/Commons/Designators/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Designators.rdf"})

(def cmns-dt
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-dt",
   :rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/DatesAndTimes.rdf"})

(def cmns-ge
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-ge",
   :rdfa/uri "https://www.omg.org/spec/Commons/GovernmentEntities/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/GovernmentEntities.rdf"})

(def cmns-ge-eeuj
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-ge-eeuj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf"})

(def cmns-ge-euj
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-ge-euj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions.rdf"})

(def cmns-ge-neuj
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-ge-neuj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf"})

(def cmns-ge-seuj
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-ge-seuj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf"})

(def cmns-ge-ukj
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-ge-ukj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf"})

(def cmns-ge-wasj
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-ge-wasj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions.rdf"})

(def cmns-ge-weuj
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-ge-weuj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions.rdf"})

(def cmns-id
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-id",
   :rdfa/uri "https://www.omg.org/spec/Commons/Identifiers/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Identifiers.rdf"})

(def cmns-loc
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-loc",
   :rdfa/uri "https://www.omg.org/spec/Commons/Locations/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Locations.rdf"})

(def cmns-org
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-org",
   :rdfa/uri "https://www.omg.org/spec/Commons/Organizations/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Organizations.rdf"})

(def cmns-prd
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-prd",
   :rdfa/uri "https://www.omg.org/spec/Commons/ProductsAndServices/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/ProductsAndServices.rdf"})

(def cmns-pts
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-pts",
   :rdfa/uri "https://www.omg.org/spec/Commons/PartiesAndSituations/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/PartiesAndSituations.rdf"})

(def cmns-qtu
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-qtu",
   :rdfa/uri "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/QuantitiesAndUnits.rdf"})

(def cmns-ra
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-ra",
   :rdfa/uri "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/RegistrationAuthorities.rdf"})

(def cmns-rga
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-rga",
   :rdfa/uri "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/RegulatoryAgencies.rdf"})

(def cmns-txt
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cmns-txt",
   :rdfa/uri "https://www.omg.org/spec/Commons/TextDatatype/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/TextDatatype.rdf"})

(def idmp-amp
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-amp",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/AmlodipineExample/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/Examples/AmlodipineExample.rdf"})

(def idmp-chg
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-chg",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/META/ChangeManagement.rdf"})

(def idmp-cmpl
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-cmpl",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/META/ISOConformanceAnnotations.rdf"})

(def idmp-dtp
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-dtp",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO21090-HarmonizedDatatypes.rdf"})

(def idmp-euctr
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-euctr",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/EuropeanUnionClinicalTrialsRegister/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/Examples/EuropeanUnionClinicalTrialsRegister.rdf"})

(def idmp-eura
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-eura",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities.rdf"})

(def idmp-eurga
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-eurga",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies.rdf"})

(def idmp-mprd
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-mprd",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11615-MedicinalProducts.rdf"})

(def idmp-phdf
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-phdf",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11239-PharmaceuticalDoseForms/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11239-PharmaceuticalDoseForms.rdf"})

(def idmp-phprd
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-phprd",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11616-PharmaceuticalProducts/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11616-PharmaceuticalProducts.rdf"})

(def idmp-ra
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-ra",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11238-RegistrationAuthorities.rdf"})

(def idmp-spor
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-spor",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/SubstancesProductsOrganisationsReferentials/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/EuropeanJurisdiction/SubstancesProductsOrganisationsReferentials.rdf"})

(def idmp-sub
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-sub",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11238-Substances.rdf"})

(def idmp-trlp
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-trlp",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/TerlipressinExample/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/Examples/TerlipressinExample.rdf"})

(def idmp-ucum
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-ucum",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Extensions/UnifiedCodeForUnitsOfMeasure/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/Extensions/UnifiedCodeForUnitsOfMeasure.rdf"})

(def idmp-uom
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "idmp-uom",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11240-UnitsOfMeasurement.rdf"})

(def lcc-3166-1
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "lcc-3166-1",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :dcat/downloadURL
     "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Countries/ISO3166-1-CountryCodes.rdf"})

(def lcc-3166-2
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "lcc-3166-2",
   :rdfa/uri
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Countries/ISO3166-2-SubdivisionCodes.rdf"})

(def lcc-639-1
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "lcc-639-1",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Languages/ISO639-1-LanguageCodes.rdf"})

(def lcc-639-2
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "lcc-639-2",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Languages/ISO639-2-LanguageCodes.rdf"})

(def lcc-cr
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "lcc-cr",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Countries/CountryRepresentation.rdf"})

(def lcc-lr
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "lcc-lr",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Languages/LanguageRepresentation.rdf"})

(def lcc-m49
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "lcc-m49",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Countries/UN-M49-RegionCodes.rdf"})
