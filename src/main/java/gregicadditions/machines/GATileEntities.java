package gregicadditions.machines;

import gregicadditions.GAConfig;
import gregicadditions.GregicAdditions;
import gregicadditions.client.ClientHandler;
import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.render.Textures;
import gregtech.api.unification.material.Materials;
import gregtech.common.metatileentities.electric.MetaTileEntityAirCollector;
import gregtech.common.metatileentities.electric.MetaTileEntityPump;
import net.minecraft.util.ResourceLocation;

import java.util.stream.IntStream;

public class GATileEntities {
	public static SimpleMachineMetaTileEntity[] CLUSTERMILL = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] ELECTRIC_FURNACE = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] MACERATOR = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] ALLOY_SMELTER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] ARC_FURNACE = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] ASSEMBLER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] AUTOCLAVE = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] BENDER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] BREWERY = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] CANNER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] CENTRIFUGE = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] CHEMICAL_BATH = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] CHEMICAL_REACTOR = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] COMPRESSOR = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] CUTTER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] DISTILLERY = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] ELECTROLYZER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] ELECTROMAGNETIC_SEPARATOR = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] EXTRACTOR = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] EXTRUDER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] FERMENTER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] FLUID_CANNER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] FLUID_EXTRACTOR = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] FLUID_HEATER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] FLUID_SOLIDIFIER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] FORGE_HAMMER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] FORMING_PRESS = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] LATHE = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] MICROWAVE = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] MIXER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] ORE_WASHER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] PACKER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] UNPACKER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] PLASMA_ARC_FURNACE = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] POLARIZER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] LASER_ENGRAVER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] SIFTER = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] THERMAL_CENTRIFUGE = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] WIREMILL = new SimpleMachineMetaTileEntity[9];
	public static SimpleGeneratorMetaTileEntity[] NAQUADAH_REACTOR = new SimpleGeneratorMetaTileEntity[8];
	public static SimpleMachineMetaTileEntity[] REPLICATOR = new SimpleMachineMetaTileEntity[9];
	public static SimpleMachineMetaTileEntity[] MASS_FAB = new SimpleMachineMetaTileEntity[9];
	public static TileEntityFusionReactor[] FUSION_REACTOR = new TileEntityFusionReactor[3];
	public static SimpleMachineMetaTileEntity[] BUNDLER = new SimpleMachineMetaTileEntity[9];

	public static TileEntityAssemblyLine ASSEMBLY_LINE;
	public static TileEntityProcessingArray PROCESSING_ARRAY;

	public static TileEntityDrum WOODEN_DRUM;
	public static TileEntityDrum BRONZE_DRUM;
	public static TileEntityDrum STEEL_DRUM;
	public static TileEntityDrum STAINLESS_STEEL_DRUM;
	public static TileEntityDrum TITANIUM_DRUM;
	public static TileEntityDrum TUNGSTENSTEEL_DRUM;
	public static TileEntityDrum OSMIUM_DRUM;
	public static TileEntityDrum DARMSTADTIUM_DRUM;

	public static TileEntityCrate WOODEN_CRATE;
	public static TileEntityCrate BRONZE_CRATE;
	public static TileEntityCrate STEEL_CRATE;
	public static TileEntityCrate STAINLESS_STEEL_CRATE;
	public static TileEntityCrate TITANIUM_CRATE;
	public static TileEntityCrate TUNGSTENSTEEL_CRATE;
	public static TileEntityCrate OSMIUM_CRATE;
	public static TileEntityCrate DARMSTADTIUM_CRATE;

	public static MetaTileEntityPump[] PUMP = new MetaTileEntityPump[9];
	public static MetaTileEntityAirCollector[] AIR_COLLECTOR = new MetaTileEntityAirCollector[8];

	public static MetaTileEntityMachineHolder MACHINE_ACCESS_INTERFACE;

	public static void init() {

		if (GAConfig.GT5U.highTierClusterMills) {
			CLUSTERMILL[0] = GregTechAPI.registerMetaTileEntity(2008, new SimpleMachineMetaTileEntity(location("cluster_mill.lv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 1));
			CLUSTERMILL[1] = GregTechAPI.registerMetaTileEntity(2009, new SimpleMachineMetaTileEntity(location("cluster_mill.mv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 2));
			CLUSTERMILL[2] = GregTechAPI.registerMetaTileEntity(2010, new SimpleMachineMetaTileEntity(location("cluster_mill.hv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 3));
			CLUSTERMILL[3] = GregTechAPI.registerMetaTileEntity(2011, new SimpleMachineMetaTileEntity(location("cluster_mill.ev"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 4));
			CLUSTERMILL[4] = GregTechAPI.registerMetaTileEntity(2012, new SimpleMachineMetaTileEntity(location("cluster_mill.iv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 5));
			CLUSTERMILL[5] = GregTechAPI.registerMetaTileEntity(2013, new SimpleMachineMetaTileEntity(location("cluster_mill.luv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 6));
			CLUSTERMILL[6] = GregTechAPI.registerMetaTileEntity(2014, new SimpleMachineMetaTileEntity(location("cluster_mill.zpm"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 7));
			CLUSTERMILL[7] = GregTechAPI.registerMetaTileEntity(2015, new SimpleMachineMetaTileEntity(location("cluster_mill.uv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 8));
			CLUSTERMILL[8] = GregTechAPI.registerMetaTileEntity(2223, new SimpleMachineMetaTileEntity(location("cluster_mill.max"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierElectricFurnace) {
			ELECTRIC_FURNACE[4] = GregTechAPI.registerMetaTileEntity(2016, new SimpleMachineMetaTileEntity(location("electric_furnace.iv"), RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 5));
			ELECTRIC_FURNACE[5] = GregTechAPI.registerMetaTileEntity(2017, new SimpleMachineMetaTileEntity(location("electric_furnace.luv"), RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 6));
			ELECTRIC_FURNACE[6] = GregTechAPI.registerMetaTileEntity(2018, new SimpleMachineMetaTileEntity(location("electric_furnace.zpm"), RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 7));
			ELECTRIC_FURNACE[7] = GregTechAPI.registerMetaTileEntity(2019, new SimpleMachineMetaTileEntity(location("electric_furnace.uv"), RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 8));
			ELECTRIC_FURNACE[8] = GregTechAPI.registerMetaTileEntity(2224, new SimpleMachineMetaTileEntity(location("electric_furnace.max"), RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierMacerators) {
			MACERATOR[4] = GregTechAPI.registerMetaTileEntity(2020, new SimpleMachineMetaTileEntity(location("macerator.iv"), RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 5));
			MACERATOR[5] = GregTechAPI.registerMetaTileEntity(2021, new SimpleMachineMetaTileEntity(location("macerator.luv"), RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 6));
			MACERATOR[6] = GregTechAPI.registerMetaTileEntity(2022, new SimpleMachineMetaTileEntity(location("macerator.zpm"), RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 7));
			MACERATOR[7] = GregTechAPI.registerMetaTileEntity(2023, new SimpleMachineMetaTileEntity(location("macerator.uv"), RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 8));
			MACERATOR[8] = GregTechAPI.registerMetaTileEntity(2225, new SimpleMachineMetaTileEntity(location("macerator.max"), RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierAlloySmelter) {
			ALLOY_SMELTER[4] = GregTechAPI.registerMetaTileEntity(2024, new SimpleMachineMetaTileEntity(location("alloy_smelter.iv"), RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 5));
			ALLOY_SMELTER[5] = GregTechAPI.registerMetaTileEntity(2025, new SimpleMachineMetaTileEntity(location("alloy_smelter.luv"), RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 6));
			ALLOY_SMELTER[6] = GregTechAPI.registerMetaTileEntity(2026, new SimpleMachineMetaTileEntity(location("alloy_smelter.zpm"), RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 7));
			ALLOY_SMELTER[7] = GregTechAPI.registerMetaTileEntity(2027, new SimpleMachineMetaTileEntity(location("alloy_smelter.uv"), RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 8));
			ALLOY_SMELTER[8] = GregTechAPI.registerMetaTileEntity(2226, new SimpleMachineMetaTileEntity(location("alloy_smelter.max"), RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierArcFurnaces) {
			ARC_FURNACE[4] = GregTechAPI.registerMetaTileEntity(2032, new SimpleMachineMetaTileEntity(location("arc_furnace.iv"), RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 5));
			ARC_FURNACE[5] = GregTechAPI.registerMetaTileEntity(2033, new SimpleMachineMetaTileEntity(location("arc_furnace.luv"), RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 6));
			ARC_FURNACE[6] = GregTechAPI.registerMetaTileEntity(2034, new SimpleMachineMetaTileEntity(location("arc_furnace.zpm"), RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 7));
			ARC_FURNACE[7] = GregTechAPI.registerMetaTileEntity(2035, new SimpleMachineMetaTileEntity(location("arc_furnace.uv"), RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 8));
			ARC_FURNACE[8] = GregTechAPI.registerMetaTileEntity(2227, new SimpleMachineMetaTileEntity(location("arc_furnace.max"), RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierAssemblers) {
			ASSEMBLER[5] = GregTechAPI.registerMetaTileEntity(2037, new SimpleMachineMetaTileEntity(location("assembler.luv"), RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 6));
			ASSEMBLER[6] = GregTechAPI.registerMetaTileEntity(2038, new SimpleMachineMetaTileEntity(location("assembler.zpm"), RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 7));
			ASSEMBLER[7] = GregTechAPI.registerMetaTileEntity(2039, new SimpleMachineMetaTileEntity(location("assembler.uv"), RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 8));
			ASSEMBLER[8] = GregTechAPI.registerMetaTileEntity(2228, new SimpleMachineMetaTileEntity(location("assembler.max"), RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierAutoclaves) {
			AUTOCLAVE[5] = GregTechAPI.registerMetaTileEntity(2041, new SimpleMachineMetaTileEntity(location("autoclave.luv"), RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 6));
			AUTOCLAVE[6] = GregTechAPI.registerMetaTileEntity(2042, new SimpleMachineMetaTileEntity(location("autoclave.zpm"), RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 7));
			AUTOCLAVE[7] = GregTechAPI.registerMetaTileEntity(2043, new SimpleMachineMetaTileEntity(location("autoclave.uv"), RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 8));
			AUTOCLAVE[8] = GregTechAPI.registerMetaTileEntity(2229, new SimpleMachineMetaTileEntity(location("autoclave.max"), RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierBenders) {
			BENDER[4] = GregTechAPI.registerMetaTileEntity(2044, new SimpleMachineMetaTileEntity(location("bender.iv"), RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 5));
			BENDER[5] = GregTechAPI.registerMetaTileEntity(2045, new SimpleMachineMetaTileEntity(location("bender.luv"), RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 6));
			BENDER[6] = GregTechAPI.registerMetaTileEntity(2046, new SimpleMachineMetaTileEntity(location("bender.zpm"), RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 7));
			BENDER[7] = GregTechAPI.registerMetaTileEntity(2047, new SimpleMachineMetaTileEntity(location("bender.uv"), RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 8));
			BENDER[8] = GregTechAPI.registerMetaTileEntity(2230, new SimpleMachineMetaTileEntity(location("bender.max"), RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierBreweries) {
			BREWERY[4] = GregTechAPI.registerMetaTileEntity(2048, new SimpleMachineMetaTileEntity(location("brewery.iv"), RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 5));
			BREWERY[5] = GregTechAPI.registerMetaTileEntity(2049, new SimpleMachineMetaTileEntity(location("brewery.luv"), RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 6));
			BREWERY[6] = GregTechAPI.registerMetaTileEntity(2050, new SimpleMachineMetaTileEntity(location("brewery.zpm"), RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 7));
			BREWERY[7] = GregTechAPI.registerMetaTileEntity(2051, new SimpleMachineMetaTileEntity(location("brewery.uv"), RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 8));
			BREWERY[8] = GregTechAPI.registerMetaTileEntity(2231, new SimpleMachineMetaTileEntity(location("brewery.max"), RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierCanners) {
			CANNER[4] = GregTechAPI.registerMetaTileEntity(2052, new SimpleMachineMetaTileEntity(location("canner.iv"), RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 5));
			CANNER[5] = GregTechAPI.registerMetaTileEntity(2053, new SimpleMachineMetaTileEntity(location("canner.luv"), RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 6));
			CANNER[6] = GregTechAPI.registerMetaTileEntity(2054, new SimpleMachineMetaTileEntity(location("canner.zpm"), RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 7));
			CANNER[7] = GregTechAPI.registerMetaTileEntity(2055, new SimpleMachineMetaTileEntity(location("canner.uv"), RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 8));
			CANNER[8] = GregTechAPI.registerMetaTileEntity(2232, new SimpleMachineMetaTileEntity(location("canner.max"), RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierCentrifuges) {
			CENTRIFUGE[4] = GregTechAPI.registerMetaTileEntity(2056, new SimpleMachineMetaTileEntity(location("centrifuge.iv"), RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 5));
			CENTRIFUGE[5] = GregTechAPI.registerMetaTileEntity(2057, new SimpleMachineMetaTileEntity(location("centrifuge.luv"), RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 6));
			CENTRIFUGE[6] = GregTechAPI.registerMetaTileEntity(2058, new SimpleMachineMetaTileEntity(location("centrifuge.zpm"), RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 7));
			CENTRIFUGE[7] = GregTechAPI.registerMetaTileEntity(2059, new SimpleMachineMetaTileEntity(location("centrifuge.uv"), RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 8));
			CENTRIFUGE[8] = GregTechAPI.registerMetaTileEntity(2233, new SimpleMachineMetaTileEntity(location("centrifuge.max"), RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierChemicalBaths) {
			CHEMICAL_BATH[4] = GregTechAPI.registerMetaTileEntity(2060, new SimpleMachineMetaTileEntity(location("chemical_bath.iv"), RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 5));
			CHEMICAL_BATH[5] = GregTechAPI.registerMetaTileEntity(2061, new SimpleMachineMetaTileEntity(location("chemical_bath.luv"), RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 6));
			CHEMICAL_BATH[6] = GregTechAPI.registerMetaTileEntity(2062, new SimpleMachineMetaTileEntity(location("chemical_bath.zpm"), RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 7));
			CHEMICAL_BATH[7] = GregTechAPI.registerMetaTileEntity(2063, new SimpleMachineMetaTileEntity(location("chemical_bath.uv"), RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 8));
			CHEMICAL_BATH[8] = GregTechAPI.registerMetaTileEntity(2234, new SimpleMachineMetaTileEntity(location("chemical_bath.max"), RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierChemicalReactors) {
			CHEMICAL_REACTOR[4] = GregTechAPI.registerMetaTileEntity(2064, new SimpleMachineMetaTileEntity(location("chemical_reactor.iv"), RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 5));
			CHEMICAL_REACTOR[5] = GregTechAPI.registerMetaTileEntity(2065, new SimpleMachineMetaTileEntity(location("chemical_reactor.luv"), RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 6));
			CHEMICAL_REACTOR[6] = GregTechAPI.registerMetaTileEntity(2066, new SimpleMachineMetaTileEntity(location("chemical_reactor.zpm"), RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 7));
			CHEMICAL_REACTOR[7] = GregTechAPI.registerMetaTileEntity(2067, new SimpleMachineMetaTileEntity(location("chemical_reactor.uv"), RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 8));
			CHEMICAL_REACTOR[8] = GregTechAPI.registerMetaTileEntity(2235, new SimpleMachineMetaTileEntity(location("chemical_reactor.max"), RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierCompressors) {
			COMPRESSOR[4] = GregTechAPI.registerMetaTileEntity(2068, new SimpleMachineMetaTileEntity(location("compressor.iv"), RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 5));
			COMPRESSOR[5] = GregTechAPI.registerMetaTileEntity(2069, new SimpleMachineMetaTileEntity(location("compressor.luv"), RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 6));
			COMPRESSOR[6] = GregTechAPI.registerMetaTileEntity(2070, new SimpleMachineMetaTileEntity(location("compressor.zpm"), RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 7));
			COMPRESSOR[7] = GregTechAPI.registerMetaTileEntity(2071, new SimpleMachineMetaTileEntity(location("compressor.uv"), RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 8));
			COMPRESSOR[8] = GregTechAPI.registerMetaTileEntity(2236, new SimpleMachineMetaTileEntity(location("compressor.max"), RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierCutters) {
			CUTTER[4] = GregTechAPI.registerMetaTileEntity(2072, new SimpleMachineMetaTileEntity(location("cutter.iv"), RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 5));
			CUTTER[5] = GregTechAPI.registerMetaTileEntity(2073, new SimpleMachineMetaTileEntity(location("cutter.luv"), RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 6));
			CUTTER[6] = GregTechAPI.registerMetaTileEntity(2074, new SimpleMachineMetaTileEntity(location("cutter.zpm"), RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 7));
			CUTTER[7] = GregTechAPI.registerMetaTileEntity(2075, new SimpleMachineMetaTileEntity(location("cutter.uv"), RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 8));
			CUTTER[8] = GregTechAPI.registerMetaTileEntity(2237, new SimpleMachineMetaTileEntity(location("cutter.max"), RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierDistilleries) {
			DISTILLERY[4] = GregTechAPI.registerMetaTileEntity(2076, new SimpleMachineMetaTileEntity(location("distillery.iv"), RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 5));
			DISTILLERY[5] = GregTechAPI.registerMetaTileEntity(2077, new SimpleMachineMetaTileEntity(location("distillery.luv"), RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 6));
			DISTILLERY[6] = GregTechAPI.registerMetaTileEntity(2078, new SimpleMachineMetaTileEntity(location("distillery.zpm"), RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 7));
			DISTILLERY[7] = GregTechAPI.registerMetaTileEntity(2079, new SimpleMachineMetaTileEntity(location("distillery.uv"), RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 8));
			DISTILLERY[8] = GregTechAPI.registerMetaTileEntity(2238, new SimpleMachineMetaTileEntity(location("distillery.max"), RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierElectrolyzers) {
			ELECTROLYZER[4] = GregTechAPI.registerMetaTileEntity(2080, new SimpleMachineMetaTileEntity(location("electrolyzer.iv"), RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 5));
			ELECTROLYZER[5] = GregTechAPI.registerMetaTileEntity(2081, new SimpleMachineMetaTileEntity(location("electrolyzer.luv"), RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 6));
			ELECTROLYZER[6] = GregTechAPI.registerMetaTileEntity(2082, new SimpleMachineMetaTileEntity(location("electrolyzer.zpm"), RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 7));
			ELECTROLYZER[7] = GregTechAPI.registerMetaTileEntity(2083, new SimpleMachineMetaTileEntity(location("electrolyzer.uv"), RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 8));
			ELECTROLYZER[8] = GregTechAPI.registerMetaTileEntity(2239, new SimpleMachineMetaTileEntity(location("electrolyzer.max"), RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierElectromagneticSeparators) {
			ELECTROMAGNETIC_SEPARATOR[4] = GregTechAPI.registerMetaTileEntity(2084, new SimpleMachineMetaTileEntity(location("electromagnetic_separator.iv"), RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 5));
			ELECTROMAGNETIC_SEPARATOR[5] = GregTechAPI.registerMetaTileEntity(2085, new SimpleMachineMetaTileEntity(location("electromagnetic_separator.luv"), RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 6));
			ELECTROMAGNETIC_SEPARATOR[6] = GregTechAPI.registerMetaTileEntity(2086, new SimpleMachineMetaTileEntity(location("electromagnetic_separator.zpm"), RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 7));
			ELECTROMAGNETIC_SEPARATOR[7] = GregTechAPI.registerMetaTileEntity(2087, new SimpleMachineMetaTileEntity(location("electromagnetic_separator.uv"), RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 8));
			ELECTROMAGNETIC_SEPARATOR[8] = GregTechAPI.registerMetaTileEntity(2240, new SimpleMachineMetaTileEntity(location("electromagnetic_separator.max"), RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierExtractors) {
			EXTRACTOR[4] = GregTechAPI.registerMetaTileEntity(2088, new SimpleMachineMetaTileEntity(location("extractor.iv"), RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 5));
			EXTRACTOR[5] = GregTechAPI.registerMetaTileEntity(2089, new SimpleMachineMetaTileEntity(location("extractor.luv"), RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 6));
			EXTRACTOR[6] = GregTechAPI.registerMetaTileEntity(2090, new SimpleMachineMetaTileEntity(location("extractor.zpm"), RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 7));
			EXTRACTOR[7] = GregTechAPI.registerMetaTileEntity(2091, new SimpleMachineMetaTileEntity(location("extractor.uv"), RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 8));
			EXTRACTOR[8] = GregTechAPI.registerMetaTileEntity(2241, new SimpleMachineMetaTileEntity(location("extractor.max"), RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierExtruders) {
			EXTRUDER[4] = GregTechAPI.registerMetaTileEntity(2092, new SimpleMachineMetaTileEntity(location("extruder.iv"), RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 5));
			EXTRUDER[5] = GregTechAPI.registerMetaTileEntity(2093, new SimpleMachineMetaTileEntity(location("extruder.luv"), RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 6));
			EXTRUDER[6] = GregTechAPI.registerMetaTileEntity(2094, new SimpleMachineMetaTileEntity(location("extruder.zpm"), RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 7));
			EXTRUDER[7] = GregTechAPI.registerMetaTileEntity(2095, new SimpleMachineMetaTileEntity(location("extruder.uv"), RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 8));
			EXTRUDER[8] = GregTechAPI.registerMetaTileEntity(2242, new SimpleMachineMetaTileEntity(location("extruder.max"), RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierFermenters) {
			FERMENTER[4] = GregTechAPI.registerMetaTileEntity(2096, new SimpleMachineMetaTileEntity(location("fermenter.iv"), RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 5));
			FERMENTER[5] = GregTechAPI.registerMetaTileEntity(2097, new SimpleMachineMetaTileEntity(location("fermenter.luv"), RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 6));
			FERMENTER[6] = GregTechAPI.registerMetaTileEntity(2098, new SimpleMachineMetaTileEntity(location("fermenter.zpm"), RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 7));
			FERMENTER[7] = GregTechAPI.registerMetaTileEntity(2099, new SimpleMachineMetaTileEntity(location("fermenter.uv"), RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 8));
			FERMENTER[8] = GregTechAPI.registerMetaTileEntity(2243, new SimpleMachineMetaTileEntity(location("fermenter.max"), RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierFluidCanners) {
			FLUID_CANNER[4] = GregTechAPI.registerMetaTileEntity(2100, new SimpleMachineMetaTileEntity(location("fluid_canner.iv"), RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 5));
			FLUID_CANNER[5] = GregTechAPI.registerMetaTileEntity(2101, new SimpleMachineMetaTileEntity(location("fluid_canner.luv"), RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 6));
			FLUID_CANNER[6] = GregTechAPI.registerMetaTileEntity(2102, new SimpleMachineMetaTileEntity(location("fluid_canner.zpm"), RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 7));
			FLUID_CANNER[7] = GregTechAPI.registerMetaTileEntity(2103, new SimpleMachineMetaTileEntity(location("fluid_canner.uv"), RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 8));
			FLUID_CANNER[8] = GregTechAPI.registerMetaTileEntity(2244, new SimpleMachineMetaTileEntity(location("fluid_canner.max"), RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierFluidExtractors) {
			FLUID_EXTRACTOR[4] = GregTechAPI.registerMetaTileEntity(2104, new SimpleMachineMetaTileEntity(location("fluid_extractor.iv"), RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 5));
			FLUID_EXTRACTOR[5] = GregTechAPI.registerMetaTileEntity(2105, new SimpleMachineMetaTileEntity(location("fluid_extractor.luv"), RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 6));
			FLUID_EXTRACTOR[6] = GregTechAPI.registerMetaTileEntity(2106, new SimpleMachineMetaTileEntity(location("fluid_extractor.zpm"), RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 7));
			FLUID_EXTRACTOR[7] = GregTechAPI.registerMetaTileEntity(2107, new SimpleMachineMetaTileEntity(location("fluid_extractor.uv"), RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 8));
			FLUID_EXTRACTOR[8] = GregTechAPI.registerMetaTileEntity(2245, new SimpleMachineMetaTileEntity(location("fluid_extractor.max"), RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierFluidHeaters) {
			FLUID_HEATER[4] = GregTechAPI.registerMetaTileEntity(2108, new SimpleMachineMetaTileEntity(location("fluid_heater.iv"), RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 5));
			FLUID_HEATER[5] = GregTechAPI.registerMetaTileEntity(2109, new SimpleMachineMetaTileEntity(location("fluid_heater.luv"), RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 6));
			FLUID_HEATER[6] = GregTechAPI.registerMetaTileEntity(2110, new SimpleMachineMetaTileEntity(location("fluid_heater.zpm"), RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 7));
			FLUID_HEATER[7] = GregTechAPI.registerMetaTileEntity(2111, new SimpleMachineMetaTileEntity(location("fluid_heater.uv"), RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 8));
			FLUID_HEATER[8] = GregTechAPI.registerMetaTileEntity(2246, new SimpleMachineMetaTileEntity(location("fluid_heater.max"), RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierFluidSolidifiers) {
			FLUID_SOLIDIFIER[4] = GregTechAPI.registerMetaTileEntity(2112, new SimpleMachineMetaTileEntity(location("fluid_solidifier.iv"), RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 5));
			FLUID_SOLIDIFIER[5] = GregTechAPI.registerMetaTileEntity(2113, new SimpleMachineMetaTileEntity(location("fluid_solidifier.luv"), RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 6));
			FLUID_SOLIDIFIER[6] = GregTechAPI.registerMetaTileEntity(2114, new SimpleMachineMetaTileEntity(location("fluid_solidifier.zpm"), RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 7));
			FLUID_SOLIDIFIER[7] = GregTechAPI.registerMetaTileEntity(2115, new SimpleMachineMetaTileEntity(location("fluid_solidifier.uv"), RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 8));
			FLUID_SOLIDIFIER[8] = GregTechAPI.registerMetaTileEntity(2247, new SimpleMachineMetaTileEntity(location("fluid_solidifier.max"), RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierForgeHammers) {
			FORGE_HAMMER[4] = GregTechAPI.registerMetaTileEntity(2116, new SimpleMachineMetaTileEntity(location("forge_hammer.iv"), RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 5));
			FORGE_HAMMER[5] = GregTechAPI.registerMetaTileEntity(2117, new SimpleMachineMetaTileEntity(location("forge_hammer.luv"), RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 6));
			FORGE_HAMMER[6] = GregTechAPI.registerMetaTileEntity(2118, new SimpleMachineMetaTileEntity(location("forge_hammer.zpm"), RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 7));
			FORGE_HAMMER[7] = GregTechAPI.registerMetaTileEntity(2119, new SimpleMachineMetaTileEntity(location("forge_hammer.uv"), RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 8));
			FORGE_HAMMER[8] = GregTechAPI.registerMetaTileEntity(2248, new SimpleMachineMetaTileEntity(location("forge_hammer.max"), RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierFormingPresses) {
			FORMING_PRESS[4] = GregTechAPI.registerMetaTileEntity(2120, new SimpleMachineMetaTileEntity(location("forming_press.iv"), RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 5));
			FORMING_PRESS[5] = GregTechAPI.registerMetaTileEntity(2121, new SimpleMachineMetaTileEntity(location("forming_press.luv"), RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 6));
			FORMING_PRESS[6] = GregTechAPI.registerMetaTileEntity(2122, new SimpleMachineMetaTileEntity(location("forming_press.zpm"), RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 7));
			FORMING_PRESS[7] = GregTechAPI.registerMetaTileEntity(2123, new SimpleMachineMetaTileEntity(location("forming_press.uv"), RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 8));
			FORMING_PRESS[8] = GregTechAPI.registerMetaTileEntity(2249, new SimpleMachineMetaTileEntity(location("forming_press.max"), RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierLathes) {
			LATHE[4] = GregTechAPI.registerMetaTileEntity(2124, new SimpleMachineMetaTileEntity(location("lathe.iv"), RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 5));
			LATHE[5] = GregTechAPI.registerMetaTileEntity(2125, new SimpleMachineMetaTileEntity(location("lathe.luv"), RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 6));
			LATHE[6] = GregTechAPI.registerMetaTileEntity(2126, new SimpleMachineMetaTileEntity(location("lathe.zpm"), RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 7));
			LATHE[7] = GregTechAPI.registerMetaTileEntity(2127, new SimpleMachineMetaTileEntity(location("lathe.uv"), RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 8));
			LATHE[8] = GregTechAPI.registerMetaTileEntity(2250, new SimpleMachineMetaTileEntity(location("lathe.max"), RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierMicrowaves) {
			MICROWAVE[4] = GregTechAPI.registerMetaTileEntity(2128, new SimpleMachineMetaTileEntity(location("microwave.iv"), RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 5));
			MICROWAVE[5] = GregTechAPI.registerMetaTileEntity(2129, new SimpleMachineMetaTileEntity(location("microwave.luv"), RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 6));
			MICROWAVE[6] = GregTechAPI.registerMetaTileEntity(2130, new SimpleMachineMetaTileEntity(location("microwave.zpm"), RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 7));
			MICROWAVE[7] = GregTechAPI.registerMetaTileEntity(2131, new SimpleMachineMetaTileEntity(location("microwave.uv"), RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 8));
			MICROWAVE[8] = GregTechAPI.registerMetaTileEntity(2251, new SimpleMachineMetaTileEntity(location("microwave.max"), RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierMixers) {
			MIXER[4] = GregTechAPI.registerMetaTileEntity(2132, new SimpleMachineMetaTileEntity(location("mixer.iv"), RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 5));
			MIXER[5] = GregTechAPI.registerMetaTileEntity(2133, new SimpleMachineMetaTileEntity(location("mixer.luv"), RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 6));
			MIXER[6] = GregTechAPI.registerMetaTileEntity(2134, new SimpleMachineMetaTileEntity(location("mixer.zpm"), RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 7));
			MIXER[7] = GregTechAPI.registerMetaTileEntity(2135, new SimpleMachineMetaTileEntity(location("mixer.uv"), RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 8));
			MIXER[8] = GregTechAPI.registerMetaTileEntity(2252, new SimpleMachineMetaTileEntity(location("mixer.max"), RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierOreWashers) {
			ORE_WASHER[4] = GregTechAPI.registerMetaTileEntity(2136, new SimpleMachineMetaTileEntity(location("ore_washer.iv"), RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 5));
			ORE_WASHER[5] = GregTechAPI.registerMetaTileEntity(2137, new SimpleMachineMetaTileEntity(location("ore_washer.luv"), RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 6));
			ORE_WASHER[6] = GregTechAPI.registerMetaTileEntity(2138, new SimpleMachineMetaTileEntity(location("ore_washer.zpm"), RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 7));
			ORE_WASHER[7] = GregTechAPI.registerMetaTileEntity(2139, new SimpleMachineMetaTileEntity(location("ore_washer.uv"), RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 8));
			ORE_WASHER[8] = GregTechAPI.registerMetaTileEntity(2253, new SimpleMachineMetaTileEntity(location("ore_washer.max"), RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierPackers) {
			PACKER[4] = GregTechAPI.registerMetaTileEntity(2140, new SimpleMachineMetaTileEntity(location("packer.iv"), RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 5));
			PACKER[5] = GregTechAPI.registerMetaTileEntity(2141, new SimpleMachineMetaTileEntity(location("packer.luv"), RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 6));
			PACKER[6] = GregTechAPI.registerMetaTileEntity(2142, new SimpleMachineMetaTileEntity(location("packer.zpm"), RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 7));
			PACKER[7] = GregTechAPI.registerMetaTileEntity(2143, new SimpleMachineMetaTileEntity(location("packer.uv"), RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 8));
			PACKER[8] = GregTechAPI.registerMetaTileEntity(2254, new SimpleMachineMetaTileEntity(location("packer.max"), RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierUnpackers) {
			UNPACKER[4] = GregTechAPI.registerMetaTileEntity(2144, new SimpleMachineMetaTileEntity(location("unpacker.iv"), RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 5));
			UNPACKER[5] = GregTechAPI.registerMetaTileEntity(2145, new SimpleMachineMetaTileEntity(location("unpacker.luv"), RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 6));
			UNPACKER[6] = GregTechAPI.registerMetaTileEntity(2146, new SimpleMachineMetaTileEntity(location("unpacker.zpm"), RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 7));
			UNPACKER[7] = GregTechAPI.registerMetaTileEntity(2147, new SimpleMachineMetaTileEntity(location("unpacker.uv"), RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 8));
			UNPACKER[8] = GregTechAPI.registerMetaTileEntity(2255, new SimpleMachineMetaTileEntity(location("unpacker.max"), RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierPlasmaArcFurnaces) {
			PLASMA_ARC_FURNACE[4] = GregTechAPI.registerMetaTileEntity(2148, new SimpleMachineMetaTileEntity(location("plasma_arc_furnace.iv"), RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 5));
			PLASMA_ARC_FURNACE[5] = GregTechAPI.registerMetaTileEntity(2149, new SimpleMachineMetaTileEntity(location("plasma_arc_furnace.luv"), RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 6));
			PLASMA_ARC_FURNACE[6] = GregTechAPI.registerMetaTileEntity(2150, new SimpleMachineMetaTileEntity(location("plasma_arc_furnace.zpm"), RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 7));
			PLASMA_ARC_FURNACE[7] = GregTechAPI.registerMetaTileEntity(2151, new SimpleMachineMetaTileEntity(location("plasma_arc_furnace.uv"), RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 8));
			PLASMA_ARC_FURNACE[8] = GregTechAPI.registerMetaTileEntity(2256, new SimpleMachineMetaTileEntity(location("plasma_arc_furnace.max"), RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierPolarizers) {
			POLARIZER[4] = GregTechAPI.registerMetaTileEntity(2152, new SimpleMachineMetaTileEntity(location("polarizer.iv"), RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 5));
			POLARIZER[5] = GregTechAPI.registerMetaTileEntity(2153, new SimpleMachineMetaTileEntity(location("polarizer.luv"), RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 6));
			POLARIZER[6] = GregTechAPI.registerMetaTileEntity(2154, new SimpleMachineMetaTileEntity(location("polarizer.zpm"), RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 7));
			POLARIZER[7] = GregTechAPI.registerMetaTileEntity(2155, new SimpleMachineMetaTileEntity(location("polarizer.uv"), RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 8));
			POLARIZER[8] = GregTechAPI.registerMetaTileEntity(2257, new SimpleMachineMetaTileEntity(location("polarizer.max"), RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierLaserEngravers) {
			LASER_ENGRAVER[5] = GregTechAPI.registerMetaTileEntity(2157, new SimpleMachineMetaTileEntity(location("laser_engraver.luv"), RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 6));
			LASER_ENGRAVER[6] = GregTechAPI.registerMetaTileEntity(2158, new SimpleMachineMetaTileEntity(location("laser_engraver.zpm"), RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 7));
			LASER_ENGRAVER[7] = GregTechAPI.registerMetaTileEntity(2159, new SimpleMachineMetaTileEntity(location("laser_engraver.uv"), RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 8));
			LASER_ENGRAVER[8] = GregTechAPI.registerMetaTileEntity(2258, new SimpleMachineMetaTileEntity(location("laser_engraver.max"), RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierSifters) {
			SIFTER[4] = GregTechAPI.registerMetaTileEntity(2160, new SimpleMachineMetaTileEntity(location("sifter.iv"), RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 5));
			SIFTER[5] = GregTechAPI.registerMetaTileEntity(2161, new SimpleMachineMetaTileEntity(location("sifter.luv"), RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 6));
			SIFTER[6] = GregTechAPI.registerMetaTileEntity(2162, new SimpleMachineMetaTileEntity(location("sifter.zpm"), RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 7));
			SIFTER[7] = GregTechAPI.registerMetaTileEntity(2163, new SimpleMachineMetaTileEntity(location("sifter.uv"), RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 8));
			SIFTER[8] = GregTechAPI.registerMetaTileEntity(2259, new SimpleMachineMetaTileEntity(location("sifter.max"), RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierThermalCentrifuges) {
			THERMAL_CENTRIFUGE[4] = GregTechAPI.registerMetaTileEntity(2164, new SimpleMachineMetaTileEntity(location("thermal_centrifuge.iv"), RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 5));
			THERMAL_CENTRIFUGE[5] = GregTechAPI.registerMetaTileEntity(2165, new SimpleMachineMetaTileEntity(location("thermal_centrifuge.luv"), RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 6));
			THERMAL_CENTRIFUGE[6] = GregTechAPI.registerMetaTileEntity(2166, new SimpleMachineMetaTileEntity(location("thermal_centrifuge.zpm"), RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 7));
			THERMAL_CENTRIFUGE[7] = GregTechAPI.registerMetaTileEntity(2167, new SimpleMachineMetaTileEntity(location("thermal_centrifuge.uv"), RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 8));
			THERMAL_CENTRIFUGE[8] = GregTechAPI.registerMetaTileEntity(2260, new SimpleMachineMetaTileEntity(location("thermal_centrifuge.max"), RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 9));
		}

		if (GAConfig.GT5U.highTierWiremills) {
			WIREMILL[4] = GregTechAPI.registerMetaTileEntity(2168, new SimpleMachineMetaTileEntity(location("wiremill.iv"), RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 5));
			WIREMILL[5] = GregTechAPI.registerMetaTileEntity(2169, new SimpleMachineMetaTileEntity(location("wiremill.luv"), RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 6));
			WIREMILL[6] = GregTechAPI.registerMetaTileEntity(2170, new SimpleMachineMetaTileEntity(location("wiremill.zpm"), RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 7));
			WIREMILL[7] = GregTechAPI.registerMetaTileEntity(2171, new SimpleMachineMetaTileEntity(location("wiremill.uv"), RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 8));
			WIREMILL[8] = GregTechAPI.registerMetaTileEntity(2261, new SimpleMachineMetaTileEntity(location("wiremill.max"), RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 9));
		}

		NAQUADAH_REACTOR[3] = GregTechAPI.registerMetaTileEntity(2172, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk1"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, ClientHandler.NAQUADAH_OVERLAY, 4));
		NAQUADAH_REACTOR[4] = GregTechAPI.registerMetaTileEntity(2173, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk2"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, ClientHandler.NAQUADAH_OVERLAY, 5));
		NAQUADAH_REACTOR[5] = GregTechAPI.registerMetaTileEntity(2174, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk3"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, ClientHandler.NAQUADAH_OVERLAY, 6));
		NAQUADAH_REACTOR[6] = GregTechAPI.registerMetaTileEntity(2191, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk4"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, ClientHandler.NAQUADAH_OVERLAY, 7));

		MASS_FAB[0] = GregTechAPI.registerMetaTileEntity(2175, new SimpleMachineMetaTileEntity(location("mass_fab.lv"), GARecipeMaps.MASS_FAB_RECIPES, ClientHandler.MASS_FAB_OVERLAY, 1));
		MASS_FAB[1] = GregTechAPI.registerMetaTileEntity(2176, new SimpleMachineMetaTileEntity(location("mass_fab.mv"), GARecipeMaps.MASS_FAB_RECIPES, ClientHandler.MASS_FAB_OVERLAY, 2));
		MASS_FAB[2] = GregTechAPI.registerMetaTileEntity(2177, new SimpleMachineMetaTileEntity(location("mass_fab.hv"), GARecipeMaps.MASS_FAB_RECIPES, ClientHandler.MASS_FAB_OVERLAY, 3));
		MASS_FAB[3] = GregTechAPI.registerMetaTileEntity(2178, new SimpleMachineMetaTileEntity(location("mass_fab.ev"), GARecipeMaps.MASS_FAB_RECIPES, ClientHandler.MASS_FAB_OVERLAY, 4));
		if (GAConfig.GT5U.highTierMassFabs) {
			MASS_FAB[4] = GregTechAPI.registerMetaTileEntity(2179, new SimpleMachineMetaTileEntity(location("mass_fab.iv"), GARecipeMaps.MASS_FAB_RECIPES, ClientHandler.MASS_FAB_OVERLAY, 5));
			MASS_FAB[5] = GregTechAPI.registerMetaTileEntity(2180, new SimpleMachineMetaTileEntity(location("mass_fab.luv"), GARecipeMaps.MASS_FAB_RECIPES, ClientHandler.MASS_FAB_OVERLAY, 6));
			MASS_FAB[6] = GregTechAPI.registerMetaTileEntity(2181, new SimpleMachineMetaTileEntity(location("mass_fab.zpm"), GARecipeMaps.MASS_FAB_RECIPES, ClientHandler.MASS_FAB_OVERLAY, 7));
			MASS_FAB[7] = GregTechAPI.registerMetaTileEntity(2182, new SimpleMachineMetaTileEntity(location("mass_fab.uv"), GARecipeMaps.MASS_FAB_RECIPES, ClientHandler.MASS_FAB_OVERLAY, 8));
			MASS_FAB[8] = GregTechAPI.registerMetaTileEntity(2262, new SimpleMachineMetaTileEntity(location("mass_fab.max"), GARecipeMaps.MASS_FAB_RECIPES, ClientHandler.MASS_FAB_OVERLAY, 8));
		}

		REPLICATOR[0] = GregTechAPI.registerMetaTileEntity(2183, new SimpleMachineMetaTileEntity(location("replicator.lv"), GARecipeMaps.REPLICATOR_RECIPES, ClientHandler.REPLICATOR_OVERLAY, 1));
		REPLICATOR[1] = GregTechAPI.registerMetaTileEntity(2184, new SimpleMachineMetaTileEntity(location("replicator.mv"), GARecipeMaps.REPLICATOR_RECIPES, ClientHandler.REPLICATOR_OVERLAY, 2));
		REPLICATOR[2] = GregTechAPI.registerMetaTileEntity(2185, new SimpleMachineMetaTileEntity(location("replicator.hv"), GARecipeMaps.REPLICATOR_RECIPES, ClientHandler.REPLICATOR_OVERLAY, 3));
		REPLICATOR[3] = GregTechAPI.registerMetaTileEntity(2186, new SimpleMachineMetaTileEntity(location("replicator.ev"), GARecipeMaps.REPLICATOR_RECIPES, ClientHandler.REPLICATOR_OVERLAY, 4));
		if (GAConfig.GT5U.highTierReplicators) {
			REPLICATOR[4] = GregTechAPI.registerMetaTileEntity(2187, new SimpleMachineMetaTileEntity(location("replicator.iv"), GARecipeMaps.REPLICATOR_RECIPES, ClientHandler.REPLICATOR_OVERLAY, 5));
			REPLICATOR[5] = GregTechAPI.registerMetaTileEntity(2188, new SimpleMachineMetaTileEntity(location("replicator.luv"), GARecipeMaps.REPLICATOR_RECIPES, ClientHandler.REPLICATOR_OVERLAY, 6));
			REPLICATOR[6] = GregTechAPI.registerMetaTileEntity(2189, new SimpleMachineMetaTileEntity(location("replicator.zpm"), GARecipeMaps.REPLICATOR_RECIPES, ClientHandler.REPLICATOR_OVERLAY, 7));
			REPLICATOR[7] = GregTechAPI.registerMetaTileEntity(2190, new SimpleMachineMetaTileEntity(location("replicator.uv"), GARecipeMaps.REPLICATOR_RECIPES, ClientHandler.REPLICATOR_OVERLAY, 8));
			REPLICATOR[8] = GregTechAPI.registerMetaTileEntity(2263, new SimpleMachineMetaTileEntity(location("replicator.max"), GARecipeMaps.REPLICATOR_RECIPES, ClientHandler.REPLICATOR_OVERLAY, 9));
		}

		ASSEMBLY_LINE = GregTechAPI.registerMetaTileEntity(2502, new TileEntityAssemblyLine(location("assembly_line")));

		FUSION_REACTOR[0] = GregTechAPI.registerMetaTileEntity(2504, new TileEntityFusionReactor(location("fusion_reactor.luv"), 6));
		FUSION_REACTOR[1] = GregTechAPI.registerMetaTileEntity(2505, new TileEntityFusionReactor(location("fusion_reactor.zpm"), 7));
		FUSION_REACTOR[2] = GregTechAPI.registerMetaTileEntity(2506, new TileEntityFusionReactor(location("fusion_reactor.uv"), 8));

		PROCESSING_ARRAY = GregTechAPI.registerMetaTileEntity(2507, new TileEntityProcessingArray(location("processing_array")));

		if (GAConfig.GT6.registerDrums) {
			WOODEN_DRUM = GregTechAPI.registerMetaTileEntity(2195, new TileEntityDrum(location("drum.wood"), Materials.Wood, 16000));
			BRONZE_DRUM = GregTechAPI.registerMetaTileEntity(2196, new TileEntityDrum(location("drum.bronze"), Materials.Bronze, 32000));
			STEEL_DRUM = GregTechAPI.registerMetaTileEntity(2197, new TileEntityDrum(location("drum.steel"), Materials.Steel, 64000));
			STAINLESS_STEEL_DRUM = GregTechAPI.registerMetaTileEntity(2198, new TileEntityDrum(location("drum.stainless_steel"), Materials.StainlessSteel, 128000));
			TITANIUM_DRUM = GregTechAPI.registerMetaTileEntity(2199, new TileEntityDrum(location("drum.titanium"), Materials.Titanium, 192000));
			TUNGSTENSTEEL_DRUM = GregTechAPI.registerMetaTileEntity(2200, new TileEntityDrum(location("drum.tungstensteel"), Materials.TungstenSteel, 256000));
			OSMIUM_DRUM = GregTechAPI.registerMetaTileEntity(2265, new TileEntityDrum(location("drum.osmium"), Materials.Osmium, 384000));
			DARMSTADTIUM_DRUM = GregTechAPI.registerMetaTileEntity(2266, new TileEntityDrum(location("drum.tungstensteel"), Materials.Darmstadtium, 512000));
		}

		if (GAConfig.GT5U.highTierPumps) {
			PUMP[4] = GregTechAPI.registerMetaTileEntity(2201, new MetaTileEntityPump(location("pump.iv"), 5));
			PUMP[5] = GregTechAPI.registerMetaTileEntity(2202, new MetaTileEntityPump(location("pump.luv"), 6));
			PUMP[6] = GregTechAPI.registerMetaTileEntity(2203, new MetaTileEntityPump(location("pump.zpm"), 7));
			PUMP[7] = GregTechAPI.registerMetaTileEntity(2204, new MetaTileEntityPump(location("pump.uv"), 8));
			PUMP[8] = GregTechAPI.registerMetaTileEntity(2267, new MetaTileEntityPump(location("pump.max"), 9));
		}

		if (GAConfig.Misc.highTierCollector) {
			AIR_COLLECTOR[4] = GregTechAPI.registerMetaTileEntity(2205, new MetaTileEntityAirCollector(location("air_collector.iv"), 5));
			AIR_COLLECTOR[5] = GregTechAPI.registerMetaTileEntity(2206, new MetaTileEntityAirCollector(location("air_collector.luv"), 6));
		}

		if (GAConfig.Misc.registerCrates) {
			WOODEN_CRATE = GregTechAPI.registerMetaTileEntity(2207, new TileEntityCrate(location("crate.wood"), Materials.Wood, 36));
			BRONZE_CRATE = GregTechAPI.registerMetaTileEntity(2208, new TileEntityCrate(location("crate.bronze"), Materials.Bronze, 54));
			STEEL_CRATE = GregTechAPI.registerMetaTileEntity(2209, new TileEntityCrate(location("crate.steel"), Materials.Steel, 72));
			STAINLESS_STEEL_CRATE = GregTechAPI.registerMetaTileEntity(2210, new TileEntityCrate(location("crate.stainless_steel"), Materials.StainlessSteel, 90));
			TITANIUM_CRATE = GregTechAPI.registerMetaTileEntity(2211, new TileEntityCrate(location("crate.titanium"), Materials.Titanium, 108));
			TUNGSTENSTEEL_CRATE = GregTechAPI.registerMetaTileEntity(2212, new TileEntityCrate(location("crate.tungstensteel"), Materials.TungstenSteel, 126));
			OSMIUM_CRATE = GregTechAPI.registerMetaTileEntity(2268, new TileEntityCrate(location("crate.osmium"), Materials.Osmium, 162));
			DARMSTADTIUM_CRATE = GregTechAPI.registerMetaTileEntity(2269, new TileEntityCrate(location("crate.darmstadtium"), Materials.Darmstadtium, 270));
		}


		MACHINE_ACCESS_INTERFACE = GregTechAPI.registerMetaTileEntity(2213, new MetaTileEntityMachineHolder(location("machine_access_interface")));


		// 2214 - 2222
		IntStream.range(0, GAConfig.Misc.highTierBundler ? 9 : 4).forEach(tier -> {
			BUNDLER[tier] =
				GregTechAPI.registerMetaTileEntity(
					2214 + tier,
					new SimpleMachineMetaTileEntity(location("bundler." + GTValues.VN[tier + 1].toLowerCase()),
													GARecipeMaps.BUNDLER_RECIPES,
													Textures.PACKER_OVERLAY, // FIXME: need new textures for this machine
													tier + 1));
		});
	}

	private static ResourceLocation location(String name) {
		return new ResourceLocation(GregicAdditions.MODID, name);
	}
}
